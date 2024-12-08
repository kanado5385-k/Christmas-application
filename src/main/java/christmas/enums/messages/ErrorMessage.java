package christmas.enums.messages;

public enum ErrorMessage implements SystemMessage {
    INVALID_INT_NUMBER("숫자가 아닌 것이 입력 되었습니다. 다시 시도해주세요."),
    INVALID_INPUT_DATE("예약 날짜를 1~31 사이로 입력해야 합니다. 다시 입력해 주세요."),
    WRONG_FORMAT_OF_ORDER("올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요."),
    INVALID_INPUT_ORDER_NAME("입력하신 메뉴 이름이 메뉴판에 없습니다. 다시 입력해 주세요."),
    DUPLICATE_ORDER_NAME("입력하신 메뉴 이름 중에 중복이 있습니다. 다시 입력해 주세요."),
    NOT_NATURAL_NUMBER("자연수가 아닌 숫자입니다. 다시 시도해주세요."),
    INVALID_INPUT_ORDER_TYPE("모든 메뉴가 음료면 주문이 불가능합니다. 다시 입력해 주세요."),
    INVALID_INPUT_QUANTITY_LIMIT("한번에 주문할 수 있는 메뉴의 수량이 20개입니다. 다시 입력해 주세요."),

    INVALID_INPUT_ANSWER("잘못된 입력입니다. 다시 입력해 주세요."),
    INVALID_INPUT_PRODUCT_NAME("존재하지 않는 상품입니다. 다시 입력해 주세요."),  
    PROBLEM_WITH_FILE("파일을 읽는 중 문제가 발생했습니다. 파일 경로와 파일 상태를 확인한 후 다시 시도해 주세요."),
    LACK_OF_PRODUCT("재고 수량을 초과하여 구매할 수 없습니다. 다시 입력해 주세요.");

    private static final String ERROR_LOG_LEVEL = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return ERROR_LOG_LEVEL + message;
    }
}

