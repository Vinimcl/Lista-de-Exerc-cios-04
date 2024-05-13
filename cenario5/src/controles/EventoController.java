class EventoController {
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoController() {
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void removerEvento(String nomeEvento) {
        Evento eventoParaRemover = null;
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento)) {
                eventoParaRemover = evento;
                break;
            }
        }
        if (eventoParaRemover != null) {
            eventos.remove(eventoParaRemover);
        } else {
            System.out.println("Evento não encontrado!");
        }
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void removerReserva(String responsavel) {
        Reserva reservaParaRemover = null;
        for (Reserva reserva : reservas) {
            if (reserva.getResponsavel().equals(responsavel)) {
                reservaParaRemover = reserva;
                break;
            }
        }
        if (reservaParaRemover != null) {
            reservas.remove(reservaParaRemover);
        } else {
            System.out.println("Reserva não encontrada!");
        }
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
