package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService{

    @Override
    public String getQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
