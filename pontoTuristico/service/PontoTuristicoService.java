@Service
public class PontoTuristicoService {

    @Autowired
    private PontoTuristicoRepository pontoTuristicoRepository;

    public PontoTuristico salvar(PontoTuristico pontoTuristico) {
        return pontoTuristicoRepository.save(pontoTuristico);
    }

    public List<PontoTuristico> listarTodos() {
        return pontoTuristicoRepository.findAll();
    }

    public PontoTuristico buscarPorId(Long id) {
        return pontoTuristicoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        pontoTuristicoRepository.deleteById(id);
    }

    public PontoTuristico atualizar(PontoTuristico pontoTuristico) {
        return pontoTuristicoRepository.save(pontoTuristico);
    }

    public void importarCSV(String filePath) {
    }

    public void exportarCSV(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            List<String[]> data = 
            writer.writeAll(data);
        } catch (IOException e) {            
        }
    }
}