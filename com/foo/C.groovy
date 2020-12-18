package com.foo

class C implements I {

    @Override
    String getName() {
        null
    }

    @Override
    boolean isLoggable(Level level) {
        false
    }

    @Override
    void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {}

    @Override
    void log(Level level, ResourceBundle bundle, String format, Object... params) {}
}
