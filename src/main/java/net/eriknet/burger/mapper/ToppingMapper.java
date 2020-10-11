package net.eriknet.burger.mapper;

import net.eriknet.burger.dto.ToppingResponseDto;
import net.eriknet.burger.model.Topping;
import net.eriknet.burger.utils.PriceFormatter;

import java.util.List;
import java.util.stream.Collectors;

public class ToppingMapper {

    public static ToppingResponseDto toDto(Topping topping) {
        var dto = new ToppingResponseDto();
        dto.setDescription(topping.getDescription());
        dto.setPrice(PriceFormatter.getPriceAsString(Topping.SURCHARGE));
        return dto;
    }

    public static List<Topping> toToppings(List<String> toppings) {
        return toppings.stream().map(Topping::new).collect(Collectors.toList());
    }
}
