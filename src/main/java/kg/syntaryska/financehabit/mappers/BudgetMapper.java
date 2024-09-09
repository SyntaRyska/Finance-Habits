package kg.syntaryska.financehabit.mappers;

import kg.syntaryska.financehabit.models.dtos.BudgetDto;
import kg.syntaryska.financehabit.models.entities.BudgetEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {

    BudgetEntity toEntity(BudgetDto budgetDto);
}
