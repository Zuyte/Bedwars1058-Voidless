package me.zuyte.voidless.match;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;

public class placersn implements Listener {
    public placersn(Block bed, TeamColor col, int i, IArena ar) {
        int TOX = bed.getZ();
        int TOY = bed.getY();
        int TOZ = bed.getX();
        int AX = TOX - 1;
        int BX = AX + 1;
        int BZ = TOZ + 1;
        int CX = BX + 1;
        int DZ = BZ - 1;
        int DX = AX + 3;
        int EX = AX + 1;
        int EZ = TOZ - 1;
        int FX = EX + 1;
        int FZ = EZ - 1;
        int BDY = TOY + 1;
        // 2nd Layer integers
        int AXX = TOX - 2;
        int BXX = AX;
        int BZZ = TOZ + 1;
        int CXX = AX + 1;
        int CZZ = TOZ + 2;
        int DXX = BX + 1;
        int EXX = AX + 3;
        int EZZ = BZZ;
        int FXX = EXX + 1;
        int FZZ = TOZ;
        int GXX = FXX - 1;
        int GZZ = FZZ - 1;
        int HXX = GXX - 1;
        int HZZ = GZZ - 1;
        int IXX = HXX - 1;
        int JXX = IXX - 1;
        int JZZ = HZZ + 1;
        int KYY = BDY + 1;
        // 3rd Layer
        int AXXX = AXX - 1;
        int BXXX = AXX;
        int BZZZ = BZZ;
        int XXXX = BXX;
        int ZZZZ = BZZ + 1;
        int CXXX = CXX;
        int CZZZ = CZZ + 1;
        int DXXX = DXX;
        int DZZZ = CZZ + 1;
        int EXXX = EXX;
        int EZZZ = EZZ + 1;
        int FXXX = FXX;
        int FZZZ = FZZ + 1;
        int GXXX = FXX + 1;
        int GZZZ = FZZ;
        int HXXX = FXX;
        int HZZZ = FZZ - 1;
        int IXXX = GXX;
        int IZZZ = GZZ - 1;
        int JXXX = HXX;
        int JZZZ = HZZ - 1;
        int KXXX = HXX - 1;
        int KZZZ = HZZ - 1;
        int LXXX = JXX;
        int LZZZ = JZZ - 1;
        int MXXX = AXX;
        int MZZZ = BZZ - 2;
        int NYYY = TOY + 3;
        int OYYY = TOY + 1;
        int PYYY = TOY + 2;

        double woolcolor = 0;
        if (col.name().equals("RED")) {
            woolcolor = 14;
        } else if (col.name().equals("BLUE")) {
            woolcolor = 11;
        } else if (col.name().equals("GREEN")) {
            woolcolor = 5;
        } else if (col.name().equals("YELLOW")) {
            woolcolor = 4;
        } else if (col.name().equals("AQUA")) {
            woolcolor = 3;
        } else if (col.name().equals("WHITE")) {
            woolcolor = 0;
        } else if (col.name().equals("PINK")) {
            woolcolor = 6;
        } else if (col.name().equals("GRAY")) {
            woolcolor = 8;
        } else if (col.name().equals("DARK_GREEN")) {
            woolcolor = 13;
        } else if (col.name().equals("DARK_GRAY")) {
            woolcolor = 7;
        }

        // 1st Layer (Wood)

        bed.getWorld().getBlockAt(TOZ, TOY, AX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AX));

        bed.getWorld().getBlockAt(BZ, TOY, BX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, TOY, BX));

        bed.getWorld().getBlockAt(BZ, TOY, CX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, TOY, CX));

        bed.getWorld().getBlockAt(DZ, TOY, DX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, TOY, DX));

        bed.getWorld().getBlockAt(EZ, TOY, EX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, TOY, EX));

        bed.getWorld().getBlockAt(EZ, TOY, FX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, TOY, FX));

        bed.getWorld().getBlockAt(TOZ, BDY, TOX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, TOX));

        bed.getWorld().getBlockAt(TOZ, BDY, FX).setType(Material.WOOD);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, FX));

        // 2nd Layer (Wool)

        bed.getWorld().getBlockAt(TOZ, TOY, AXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(TOZ, TOY, AXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AXX));

        bed.getWorld().getBlockAt(BZZ, TOY, BXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(BZZ, TOY, BXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZ, TOY, BXX));

        bed.getWorld().getBlockAt(CZZ, TOY, CXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(CZZ, TOY, CXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, TOY, CXX));

        bed.getWorld().getBlockAt(CZZ, TOY, DXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(CZZ, TOY, DXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, TOY, DXX));

        bed.getWorld().getBlockAt(EZZ, TOY, EXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(EZZ, TOY, EXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZ, TOY, EXX));

        bed.getWorld().getBlockAt(FZZ, TOY, FXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(FZZ, TOY, FXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZ, TOY, FXX));

        bed.getWorld().getBlockAt(GZZ, TOY, GXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(GZZ, TOY, GXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZ, TOY, GXX));

        bed.getWorld().getBlockAt(HZZ, TOY, HXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(HZZ, TOY, HXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, TOY, HXX));

        bed.getWorld().getBlockAt(HZZ, TOY, IXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(HZZ, TOY, IXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, TOY, IXX));

        bed.getWorld().getBlockAt(JZZ, TOY, JXX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(JZZ, TOY, JXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZ, TOY, JXX));

        bed.getWorld().getBlockAt(TOZ, BDY, AX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(TOZ, BDY, AX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, AX));

        bed.getWorld().getBlockAt(BZ, BDY, BX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(BZ, BDY, BX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, BDY, BX));

        bed.getWorld().getBlockAt(BZ, BDY, CX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(BZ, BDY, CX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, BDY, CX));

        bed.getWorld().getBlockAt(DZ, BDY, DX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(DZ, BDY, DX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, BDY, DX));

        bed.getWorld().getBlockAt(EZ, BDY, EX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(EZ, BDY, EX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, BDY, EX));

        bed.getWorld().getBlockAt(EZ, BDY, FX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(EZ, BDY, FX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, BDY, FX));

        bed.getWorld().getBlockAt(TOZ, KYY, TOX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(TOZ, KYY, TOX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, KYY, TOX));

        bed.getWorld().getBlockAt(TOZ, KYY, FX).setType(Material.WOOL);
        bed.getWorld().getBlockAt(TOZ, KYY, FX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, KYY, FX));

        // 3rd Layer (Glass)

        bed.getWorld().getBlockAt(TOZ, TOY, AXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(TOZ, TOY, AXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AXXX));

        bed.getWorld().getBlockAt(BZZZ, TOY, BXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(BZZZ, TOY, BXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZZ, TOY, BXXX));

        bed.getWorld().getBlockAt(ZZZZ, TOY, XXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(ZZZZ, TOY, XXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(ZZZZ, TOY, XXXX));

        bed.getWorld().getBlockAt(CZZZ, TOY, CXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(CZZZ, TOY, CXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZZ, TOY, CXXX));

        bed.getWorld().getBlockAt(DZZZ, TOY, DXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(DZZZ, TOY, DXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZZZ, TOY, DXXX));

        bed.getWorld().getBlockAt(EZZZ, TOY, EXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(EZZZ, TOY, EXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZZ, TOY, EXXX));

        bed.getWorld().getBlockAt(FZZZ, TOY, FXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(FZZZ, TOY, FXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZZ, TOY, FXXX));

        bed.getWorld().getBlockAt(GZZZ, TOY, GXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(GZZZ, TOY, GXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZZ, TOY, GXXX));

        bed.getWorld().getBlockAt(HZZZ, TOY, HXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(HZZZ, TOY, HXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZZ, TOY, HXXX));

        bed.getWorld().getBlockAt(IZZZ, TOY, IXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(IZZZ, TOY, IXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(IZZZ, TOY, IXXX));

        bed.getWorld().getBlockAt(JZZZ, TOY, JXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(JZZZ, TOY, JXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZZ, TOY, JXXX));

        bed.getWorld().getBlockAt(KZZZ, TOY, KXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(KZZZ, TOY, KXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(KZZZ, TOY, KXXX));

        bed.getWorld().getBlockAt(LZZZ, TOY, LXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(LZZZ, TOY, LXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(LZZZ, TOY, LXXX));

        bed.getWorld().getBlockAt(MZZZ, TOY, MXXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(MZZZ, TOY, MXXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(MZZZ, TOY, MXXX));

        bed.getWorld().getBlockAt(TOZ, OYYY, AXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(TOZ, OYYY, AXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, OYYY, AXX));

        bed.getWorld().getBlockAt(BZZ, OYYY, BXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(BZZ, OYYY, BXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZ, OYYY, BXX));

        bed.getWorld().getBlockAt(CZZ, OYYY, CXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(CZZ, OYYY, CXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, OYYY, CXX));

        bed.getWorld().getBlockAt(CZZ, OYYY, DXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(CZZ, OYYY, DXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, OYYY, DXX));

        bed.getWorld().getBlockAt(EZZ, OYYY, EXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(EZZ, OYYY, EXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZ, OYYY, EXX));

        bed.getWorld().getBlockAt(FZZ, OYYY, FXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(FZZ, OYYY, FXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZ, OYYY, FXX));

        bed.getWorld().getBlockAt(GZZ, OYYY, GXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(GZZ, OYYY, GXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZ, OYYY, GXX));

        bed.getWorld().getBlockAt(HZZ, OYYY, HXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(HZZ, OYYY, HXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, OYYY, HXX));

        bed.getWorld().getBlockAt(HZZ, OYYY, IXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(HZZ, OYYY, IXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, OYYY, IXX));

        bed.getWorld().getBlockAt(JZZ, OYYY, JXX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(JZZ, OYYY, JXX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZ, OYYY, JXX));

        bed.getWorld().getBlockAt(TOZ, PYYY, AX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(TOZ, PYYY, AX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, PYYY, AX));

        bed.getWorld().getBlockAt(BZ, PYYY, BX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(BZ, PYYY, BX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, PYYY, BX));

        bed.getWorld().getBlockAt(BZ, PYYY, CX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(BZ, PYYY, CX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, PYYY, CX));

        bed.getWorld().getBlockAt(DZ, PYYY, DX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(DZ, PYYY, DX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, PYYY, DX));

        bed.getWorld().getBlockAt(EZ, PYYY, EX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(EZ, PYYY, EX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, PYYY, EX));

        bed.getWorld().getBlockAt(EZ, PYYY, FX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(EZ, PYYY, FX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, PYYY, FX));

        bed.getWorld().getBlockAt(TOZ, NYYY, TOX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(TOZ, NYYY, TOX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, NYYY, TOX));

        bed.getWorld().getBlockAt(TOZ, NYYY, FX).setType(Material.STAINED_GLASS);
        bed.getWorld().getBlockAt(TOZ, NYYY, FX).setData((byte) woolcolor);
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, NYYY, FX));
    }
}
