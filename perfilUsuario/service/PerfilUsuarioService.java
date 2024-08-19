package service;

import model.PerfilUsuario;
import repository.PerfilUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    public PerfilUsuario criarPerfil(PerfilUsuario perfilUsuario) {
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    public PerfilUsuario buscarPorId(Long id) {
        return perfilUsuarioRepository.findById(id).orElse(null);
    }

    public List<PerfilUsuario> listarTodos() {
        return perfilUsuarioRepository.findAll();
    }

    public void deletar(Long id) {
        perfilUsuarioRepository.deleteById(id);
    }

    public PerfilUsuario atualizar(PerfilUsuario perfilUsuario) {
        return perfilUsuarioRepository.save(perfilUsuario);
    }
}