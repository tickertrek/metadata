package com.tickertrek.metadata.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tickertrek.metadata.exception.StockQuoteNotFound;
import com.tickertrek.metadata.entity.StockQuote;
import com.tickertrek.metadata.repository.StockQuoteRepository;

@Service
public class StockQuoteServiceImpl implements StockQuoteService {
	
	@Resource
	private StockQuoteRepository StockQuoteRepository;

	@Override
	@Transactional
	public StockQuote create(StockQuote stockQuote) {
		StockQuote createdStockQuote = stockQuote;
		return StockQuoteRepository.save(createdStockQuote);
	}
	
	@Override
	@Transactional
	public StockQuote findById(int id) {
		return StockQuoteRepository.findOne(id);
	}

	@Override
	@Transactional(rollbackFor=StockQuoteNotFound.class)
	public StockQuote delete(int id) throws StockQuoteNotFound {
		StockQuote deletedStockQuote = StockQuoteRepository.findOne(id);
		
		if (deletedStockQuote == null)
			throw new StockQuoteNotFound();
		
		StockQuoteRepository.delete(deletedStockQuote);
		return deletedStockQuote;
	}

	@Override
	@Transactional
	public List<StockQuote> findAll() {
		return StockQuoteRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor=StockQuoteNotFound.class)
	public StockQuote update(StockQuote stockQuote) throws StockQuoteNotFound {
		StockQuote updatedStockQuote = StockQuoteRepository.findOne(stockQuote.getId());
		
		if (updatedStockQuote == null)
			throw new StockQuoteNotFound();
		
		updatedStockQuote.setName(stockQuote.getName());
		updatedStockQuote.setEmplNumber(stockQuote.getEmplNumber());
		return updatedStockQuote;
	}

}
