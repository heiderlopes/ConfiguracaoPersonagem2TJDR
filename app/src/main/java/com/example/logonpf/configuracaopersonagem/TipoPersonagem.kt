package com.example.logonpf.configuracaopersonagem

enum class TipoPersonagemEnum(val id: Int) {
    ANAO(0),
    ELFO(1),
    ORC(2),
    GUERREIRO(3),
    MAGO(4);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum =
                TipoPersonagemEnum.values().first { it.id == findValue }
    }
}