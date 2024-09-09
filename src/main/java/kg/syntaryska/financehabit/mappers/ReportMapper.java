package kg.syntaryska.financehabit.mappers;

import kg.syntaryska.financehabit.models.dtos.ReportDto;
import kg.syntaryska.financehabit.models.entities.ReportEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReportMapper {
    ReportEntity toEntity(ReportDto reportDto);
}
