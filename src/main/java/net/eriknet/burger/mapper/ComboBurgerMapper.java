package net.eriknet.burger.mapper;

import net.eriknet.burger.dto.ComboBurgerResponseDto;
import net.eriknet.burger.model.ComboBurger;
import net.eriknet.burger.utils.PriceFormatter;
import org.springframework.stereotype.Service;

@Service
public class ComboBurgerMapper {

    public static ComboBurgerResponseDto toDto(ComboBurger burger) {

        var dto = new ComboBurgerResponseDto();
        dto.setSurcharge(PriceFormatter.getPriceAsString(ComboBurger.SURCHARGE));
        dto.setBurgerDto(BurgerMapper.toDto(burger));
        dto.setDrinks(ComboBurger.DRINKS.toString());
        dto.setChips(ComboBurger.CHIPS.toString());
        return dto;
    }
}
