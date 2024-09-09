package kg.syntaryska.financehabit.services;

import kg.syntaryska.financehabit.models.dtos.BudgetDto;
import kg.syntaryska.financehabit.models.entities.BudgetEntity;

import java.util.List;

public interface BudgetService {

    BudgetEntity createBudget(BudgetDto budgetdto);

    BudgetEntity updateBudget(BudgetDto budgetdto);

    BudgetEntity deleteBudget(BudgetDto budgetdto);

    BudgetEntity getBudgetById(long id);

    List<BudgetEntity> getAllBudgets();


}
