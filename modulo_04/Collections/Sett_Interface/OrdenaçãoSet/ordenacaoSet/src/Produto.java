import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  // Attributes
  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public int compareTo(Produto p) {
    // Compare by nome (name) while ignoring case
    return nome.compareToIgnoreCase(p.getNome());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto)) return false;
    Produto produto = (Produto) o;
    return getCodigo() == produto.getCodigo();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigo());
  }

  @Override
  public String toString() {
    return "Produto{" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }
}

class ComparatorPorPreco implements Comparator<Produto> {
  @Override
  public int compare(Produto p1, Produto p2) {
    // Compare by preco (price)
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}
