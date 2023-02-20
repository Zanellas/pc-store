package com.zanell.pcstore;

import com.zanell.pcstore.entity.products.Motherboard;
import com.zanell.pcstore.entity.products.Processor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Processor processor = new Processor("000001", 899.99, 1,
                "Intel", "i5-10400F", "2.9GHz", "12MB",
                "6", "12", "LGA 1200");

        Motherboard motherboard = new Motherboard("000002", 559.99, 1,
                "Gigabyte", "H510M", "Intel LGA 1200", "Intel H510 Express",
                "- 1x Slot PCI Express x16, Executando a x16 (PCIEX16)\n" +
                        "*Para Desempenho ideal, se apenas uma placa gráfica PCI Express for Instalada, Certifique-se de Instalá-la no Slot PCIEX16.\n" +
                        "(O slot PCIEX16 está em conformidade com o padrão PCI Express 4.0.) *\n" +
                        "*Suportado apenas por Processadores de 11ª Geração.\n" +
                        "- 1x Slot PCI Express x1 (PCIEX1_1)\n" +
                        "(O slot PCIEX1 está em conformidade com o padrão PCI Express 3.0.)",
                "- Processadores Intel Core i9 / i7 / i5 de 11ª geração : Suporte para Módulos de Memória DDR4 3200/3000/2933/2666/2400/2133 MHz\n" +
                        "- Processadores Intel Core i9 / i7 de 10ª geração : Suporte para Módulos de Memória DDR4 2933/2666/2400/2133 MHz\n" +
                        "- 10ª Geração Intel Núcleo i5 / i3 / Pentium / Celeron Processadores: Suporte para DDR4 Módulos de Memória 2666/2400/2133 MHz\n" +
                        "- 2x Soquetes DDR4 DIMM com Suporte para até 64 GB (Capacidade de DIMM único de 32 GB) de Memória do Sistema\n" +
                        "- Arquitetura de Memória Dual Channel\n" +
                        "- Suporte para Módulos de Memória DIMM 1Rx8 / 2Rx8 ECC sem Buffer (Operar em Modo não ECC)\n" +
                        "- Suporte para Módulos de Memória DIMM 1Rx8 / 2Rx8 / 1Rx16 não-ECC sem Buffer\n" +
                        "- Suporte para Módulos de Memória Extreme Memory Profile (XMP)",
                "- 1x conector M.2 (soquete 3, chave M, tipo 2260/2280/22110 SATA e suporte a PCIe 3.0 x4 / x2 SSD)\n" +
                        "- 4x conectores SATA de 6 Gb/s\n" +
                        "* Consulte \"1-7 Conectores internos\" para ver os avisos de instalação dos conectores M.2 e SATA.");

        System.out.println(processor);
        System.out.println(motherboard);
        System.out.println(processor.equals(motherboard));
    }
}