package net.eriknet.burger.mapper;

import net.eriknet.burger.dto.BurgerResponseDto;
import net.eriknet.burger.model.Burger;
import net.eriknet.burger.utils.PriceFormatter;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class BurgerMapper {

    public static BurgerResponseDto toDto(Burger burger) {

        var dto = new BurgerResponseDto();
        dto.setBasePrice(PriceFormatter.getPriceAsString(Burger.BASE_PRIZE));
        dto.setName(burger.getName());
        dto.setBread(burger.getBread().getDescription());
        dto.setMeat(burger.getMeat().getDescription());
        dto.setToppings(burger.getToppings().stream().map(ToppingMapper::toDto).collect(Collectors.toList()));
        dto.setTotalPrice(PriceFormatter.getPriceAsString(burger.getTotalPrice()));
        return dto;
    }
}
