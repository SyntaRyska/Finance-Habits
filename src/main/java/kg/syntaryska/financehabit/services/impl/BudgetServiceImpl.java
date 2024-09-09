package kg.syntaryska.financehabit.services.impl;

import kg.syntaryska.financehabit.mappers.BudgetMapper;
import kg.syntaryska.financehabit.models.dtos.BudgetDto;
import kg.syntaryska.financehabit.models.entities.BudgetEntity;
import kg.syntaryska.financehabit.repositories.BudgetRepository;
import kg.syntaryska.financehabit.services.BudgetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BudgetServiceImpl implements BudgetService {

    private BudgetRepository budgetRepository;
    private BudgetMapper budgetMapper;
    private static Logger logger = Logger.getLogger(BudgetServiceImpl.class.getName());

    public BudgetServiceImpl(BudgetMapper budgetMapper, BudgetRepository budgetRepository) {
        this.budgetMapper = budgetMapper;
        this.budgetRepository = budgetRepository;
    }

    @Override
    public BudgetEntity createBudget(BudgetDto budgetdto) {
        return null;
    }

    @Override
    public BudgetEntity updateBudget(BudgetDto budgetdto) {
        return null;
    }

    @Override
    public BudgetEntity deleteBudget(BudgetDto budgetdto) {
        return null;
    }

    @Override
    public BudgetEntity getBudgetById(long id) {
        return null;
    }

    @Override
    public List<BudgetEntity> getAllBudgets() {
        return List.of();
    }
}
