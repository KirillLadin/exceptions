package exceptions;

public class CountryOpenChecker {

    public static String getOpen(final Country country) throws NoSuchCountryException {
        return switch (country) {
            case RUSSIA, CHILI -> "open";
            case USA, HUNGARY -> "limited open";
            //FIXME: Страна CHINA написана в  строке с русской буквой C, а не латиницей как задекларировано в enum
            case CHINA, UK -> "closed";
            default -> throw new NoSuchCountryException();
        };
    }
}
