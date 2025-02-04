package org.sid.projet_hps.services;

import org.sid.projet_hps.entities.AcceptorInfo;
import org.sid.projet_hps.entities.CurrencyConversionInfo;
import org.sid.projet_hps.entities.TransactionInfo;
import org.sid.projet_hps.repositories.CurrencyConversionInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyConversionInfoServiceImp implements CurrencyConversionInfoService {

    @Autowired
    private CurrencyConversionInfoRepository currencyConversionInfoRepository;

    @Override
    public List<CurrencyConversionInfo> getAll() {
        return currencyConversionInfoRepository.findAll();
    }

    @Override
    public Optional<CurrencyConversionInfo> getById(Long id) {
        return currencyConversionInfoRepository.findById(id);
    }

    @Override
    public CurrencyConversionInfo save(CurrencyConversionInfo currencyConversionInfo) {
        return currencyConversionInfoRepository.save(currencyConversionInfo);
    }

    @Override
    public void deleteById(Long id) {
        currencyConversionInfoRepository.deleteById(id);
    }

    @Override
    public void saveTransactionBaseInfo(TransactionInfo baseInfo) {

    }

    @Override
    public TransactionInfo getTransactionBaseInfo(Long id) {
        return null;
    }

    @Override
    public void saveTransactionMerchantInfo(AcceptorInfo merchantInfo) {

    }

    @Override
    public AcceptorInfo getTransactionMerchantInfo(Long id) {
        return null;
    }
}
