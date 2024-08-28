package com.web.estacio.pontos_turisticos.service.impl;

import com.web.estacio.pontos_turisticos.dao.InteresseJPADAO;
import com.web.estacio.pontos_turisticos.dao.impl.InteresseJPADAOImpl;
import com.web.estacio.pontos_turisticos.model.Interesse;
import com.web.estacio.pontos_turisticos.service.InteresseService;

import javax.swing.*;
import java.util.List;

public class InteresseServiceImpl implements InteresseService {

    private InteresseJPADAO interesseJPADAO = new InteresseJPADAOImpl();


    public void geral(){
        StringBuilder submenu = new StringBuilder("Escolha uma opção:\n")
                .append("1 - Inserir Interesse\n")
                .append("2 - Exibir Todos os Interesses \n")
                .append("3 - Atualizar Interesse por ID\n")
                .append("4 - Exibir Interesses por ID\n")
                .append("5 - Remover Interesse por ID\n")
                .append("6 - Sair");

        char opcao = '0';
        do {

            try{



                opcao = JOptionPane.showInputDialog(submenu.toString()).charAt(0);
                switch (opcao) {
                    case '1':
                        insert();
                        break;
                    case '2':
                        findAll();
                        break;
                    case '3':
                        break;
                    case '4':
                        break;
                    case '5':

                        break;
                    case '6':
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }

        } while(opcao != '6');
    }

    public void insert() {

        Interesse interesse = new Interesse();

        String Descricao = JOptionPane.showInputDialog("Descrição", interesse.getDescricao());

        interesse.setDescricao(Descricao);

        interesseJPADAO.save(interesse);


    }

    public void findAll(){

        StringBuilder listagem = new StringBuilder();

        List<Interesse> interesses = interesseJPADAO.find();


        for(Interesse cl : interesses) {
            listagem.append(cl).append("\n");
        }
        JOptionPane.showMessageDialog(null, listagem.length() == 0 ? "Nenhum interesse encontrado" : listagem);
    }




}
