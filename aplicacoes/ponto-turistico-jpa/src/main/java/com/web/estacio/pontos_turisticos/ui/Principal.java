package com.web.estacio.pontos_turisticos.ui;

import com.web.estacio.pontos_turisticos.service.InteresseService;
import com.web.estacio.pontos_turisticos.service.impl.InteresseServiceImpl;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder("Escolha uma opção:\n")
                .append("1 - Interesses\n")
                .append("2 - Atualizar por CPF\n")
                .append("3 - Remover por CPF\n")
                .append("4 - Exibir por CPF\n")
                .append("5 - Exibir por id\n")
                .append("6 - Exibir todos\n")
                .append("7 - Exibir todos que contem determinado nome\n")
                .append("8 - Sair");


        char opcao = '0';
        do {
            opcao = JOptionPane.showInputDialog(menu.toString()).charAt(0);
            switch (opcao) {
                case '1':
                    InteresseService interesseService = new InteresseServiceImpl();
                    interesseService.geral();
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        } while (opcao != '8');
    }
}
