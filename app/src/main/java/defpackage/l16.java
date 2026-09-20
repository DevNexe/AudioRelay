package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzate;
import com.google.android.gms.internal.ads.zzaur;
import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzawl;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbau;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l16 {
    public static final int a = zzban.zzg("vide");
    public static final int b = zzban.zzg("soun");
    public static final int c = zzban.zzg("text");
    public static final int d = zzban.zzg("sbtl");
    public static final int e = zzban.zzg("subt");
    public static final int f = zzban.zzg("clcp");
    public static final int g = zzban.zzg("cenc");
    public static final int h = zzban.zzg("meta");

    /* JADX WARN: Code duplicated, block: B:57:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[DONT_INVERT, PHI: r3 r11 r12
  0x00e8: PHI (r3v12 int) = (r3v11 int), (r3v13 int), (r3v14 int) binds: [B:56:0x00d4, B:63:0x00e7, B:62:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:56:0x00d4, B:63:0x00e7, B:62:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r12v4 int) = (r12v3 int), (r12v3 int), (r12v5 int) binds: [B:56:0x00d4, B:63:0x00e7, B:62:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.List] */
    public static zzawk a(g16 g16Var, h16 h16Var, long j, zzaur zzaurVar, boolean z) throws zzasv {
        int i;
        long jZzm;
        int i2;
        zzawk zzawkVar;
        Pair pairCreate;
        h16 h16VarC;
        wu5 wu5Var;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        zzbag zzbagVar;
        int i8;
        int i9;
        boolean z2;
        byte[] bArrCopyOfRange;
        int i10;
        int i11;
        String str2;
        wu5 wu5Var2;
        int i12;
        int iZzj;
        int iRound;
        int iZzi;
        int i13;
        String str3;
        zzbag zzbagVar2;
        int i14;
        int i15;
        wu5 wu5Var3;
        String str4;
        int iZzc;
        String str5;
        String str6;
        int i16;
        String str7;
        String str8;
        String str9;
        Object obj;
        Object objSingletonList;
        g16 g16VarB = g16Var.b(i16.F);
        zzbag zzbagVar3 = g16VarB.c(i16.T).P0;
        zzbagVar3.zzv(16);
        int iZze = zzbagVar3.zze();
        int i17 = -1;
        if (iZze == b) {
            i = 1;
        } else if (iZze == a) {
            i = 2;
        } else if (iZze == c || iZze == d || iZze == e || iZze == f) {
            i = 3;
        } else {
            i = iZze == h ? 4 : -1;
        }
        String str10 = null;
        if (i == -1) {
            return null;
        }
        zzbag zzbagVar4 = g16Var.c(i16.P).P0;
        zzbagVar4.zzv(8);
        int iZze2 = (zzbagVar4.zze() >> 24) & 255;
        zzbagVar4.zzw(iZze2 == 0 ? 8 : 16);
        int iZze3 = zzbagVar4.zze();
        zzbagVar4.zzw(4);
        int iZzc2 = zzbagVar4.zzc();
        int i18 = iZze2 == 0 ? 4 : 8;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            if (i20 >= i18) {
                zzbagVar4.zzw(i18);
            } else {
                if (zzbagVar4.zza[iZzc2 + i20] != -1) {
                    jZzm = iZze2 == 0 ? zzbagVar4.zzm() : zzbagVar4.zzn();
                    if (jZzm != 0) {
                        break;
                    }
                    break;
                }
                i20++;
            }
            jZzm = -9223372036854775807L;
            break;
        }
        zzbagVar4.zzw(16);
        int iZze4 = zzbagVar4.zze();
        int iZze5 = zzbagVar4.zze();
        zzbagVar4.zzw(4);
        int iZze6 = zzbagVar4.zze();
        int iZze7 = zzbagVar4.zze();
        int i21 = 65536;
        if (iZze4 == 0) {
            if (iZze5 != 65536) {
                iZze4 = 0;
            } else if (iZze6 != -65536) {
                iZze4 = 0;
                iZze5 = 65536;
            } else if (iZze7 == 0) {
                i2 = 90;
            } else {
                iZze4 = 0;
                iZze5 = 65536;
                iZze6 = -65536;
            }
            if (iZze4 != 0) {
                if (iZze5 == -65536) {
                    if (iZze6 == 65536) {
                        i21 = iZze6;
                    } else if (iZze7 == 0) {
                        i2 = 270;
                    }
                    iZze6 = i21;
                    iZze4 = 0;
                    iZze5 = -65536;
                } else {
                    iZze4 = 0;
                }
                if (iZze4 != -65536) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if (iZze4 != -65536) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        } else if (iZze4 != 0) {
            if (iZze5 == -65536) {
                if (iZze6 == 65536) {
                    i21 = iZze6;
                } else if (iZze7 == 0) {
                    i2 = 270;
                }
                iZze6 = i21;
                iZze4 = 0;
                iZze5 = -65536;
            } else {
                iZze4 = 0;
            }
            if (iZze4 != -65536) {
                i2 = 0;
            } else {
                i2 = 0;
            }
        } else if (iZze4 != -65536 && iZze5 == 0 && iZze6 == 0 && iZze7 == -65536) {
            i2 = 180;
        } else {
            i2 = 0;
        }
        long j2 = j == -9223372036854775807L ? jZzm : j;
        zzbag zzbagVar5 = h16Var.P0;
        zzbagVar5.zzv(8);
        zzbagVar5.zzw(((zzbagVar5.zze() >> 24) & 255) == 0 ? 8 : 16);
        long jZzm2 = zzbagVar5.zzm();
        long jZzj = j2 == -9223372036854775807L ? -9223372036854775807L : zzban.zzj(j2, 1000000L, jZzm2);
        g16 g16VarB2 = g16VarB.b(i16.G).b(i16.H);
        zzbag zzbagVar6 = g16VarB.c(i16.S).P0;
        zzbagVar6.zzv(8);
        int iZze8 = (zzbagVar6.zze() >> 24) & 255;
        zzbagVar6.zzw(iZze8 == 0 ? 8 : 16);
        long jZzm3 = zzbagVar6.zzm();
        zzbagVar6.zzw(iZze8 == 0 ? 4 : 8);
        int iZzj2 = zzbagVar6.zzj();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iZzj2 >> 10) & 31) + 96));
        sb.append((char) (((iZzj2 >> 5) & 31) + 96));
        sb.append((char) ((iZzj2 & 31) + 96));
        Pair pairCreate2 = Pair.create(Long.valueOf(jZzm3), sb.toString());
        zzbag zzbagVar7 = g16VarB2.c(i16.U).P0;
        String str11 = (String) pairCreate2.second;
        zzbagVar7.zzv(12);
        int iZze9 = zzbagVar7.zze();
        wu5 wu5Var4 = new wu5(iZze9);
        int i22 = 0;
        while (i22 < iZze9) {
            int iZzc3 = zzbagVar7.zzc();
            int iZze10 = zzbagVar7.zze();
            int i23 = i;
            String str12 = "childAtomSize should be positive";
            zzazy.zzd(iZze10 > 0, "childAtomSize should be positive");
            int iZze11 = zzbagVar7.zze();
            if (iZze11 == i16.c || iZze11 == i16.d || iZze11 == i16.a0 || iZze11 == i16.l0 || iZze11 == i16.e || iZze11 == i16.f || iZze11 == i16.g || iZze11 == i16.K0 || iZze11 == i16.L0) {
                int i24 = i22;
                wu5Var = wu5Var4;
                i3 = iZze9;
                Object obj2 = "childAtomSize should be positive";
                str = str11;
                zzbag zzbagVar8 = zzbagVar7;
                pairCreate2 = pairCreate2;
                zzbagVar8.zzv(iZzc3 + 16);
                zzbagVar8.zzw(16);
                int iZzj3 = zzbagVar8.zzj();
                int iZzj4 = zzbagVar8.zzj();
                zzbagVar8.zzw(50);
                int iZzc4 = zzbagVar8.zzc();
                if (iZze11 == i16.a0) {
                    i4 = i24;
                    i5 = iZze10;
                    iZze11 = c(zzbagVar8, iZzc3, i5, wu5Var, i4);
                    zzbagVar8.zzv(iZzc4);
                } else {
                    i4 = i24;
                    i5 = iZze10;
                }
                String str13 = null;
                boolean z3 = false;
                List listSingletonList = null;
                float fZzi = 1.0f;
                byte[] bArr = null;
                int i25 = -1;
                while (iZzc4 - iZzc3 < i5) {
                    zzbagVar8.zzv(iZzc4);
                    int iZzc5 = zzbagVar8.zzc();
                    int iZze12 = zzbagVar8.zze();
                    if (iZze12 == 0) {
                        if (zzbagVar8.zzc() - iZzc3 == i5) {
                            break;
                        }
                        iZze12 = 0;
                    }
                    zzazy.zzd(iZze12 > 0, obj2);
                    int iZze13 = zzbagVar8.zze();
                    Object obj3 = obj2;
                    if (iZze13 == i16.I) {
                        zzazy.zze(str13 == null);
                        zzbagVar8.zzv(iZzc5 + 8);
                        zzbao zzbaoVarZza = zzbao.zza(zzbagVar8);
                        listSingletonList = zzbaoVarZza.zza;
                        wu5Var.a = zzbaoVarZza.zzb;
                        if (!z3) {
                            fZzi = zzbaoVarZza.zzc;
                        }
                        str13 = "video/avc";
                    } else if (iZze13 == i16.J) {
                        zzazy.zze(str13 == null);
                        zzbagVar8.zzv(iZzc5 + 8);
                        zzbau zzbauVarZza = zzbau.zza(zzbagVar8);
                        listSingletonList = zzbauVarZza.zza;
                        wu5Var.a = zzbauVarZza.zzb;
                        str13 = "video/hevc";
                    } else if (iZze13 == i16.M0) {
                        zzazy.zze(str13 == null);
                        str13 = iZze11 == i16.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else {
                        if (iZze13 == i16.h) {
                            zzazy.zze(str13 == null);
                            str13 = "video/3gpp";
                        } else if (iZze13 == i16.K) {
                            zzazy.zze(str13 == null);
                            Pair pairD = d(zzbagVar8, iZzc5);
                            String str14 = (String) pairD.first;
                            listSingletonList = Collections.singletonList((byte[]) pairD.second);
                            i9 = iZze11;
                            str13 = str14;
                        } else if (iZze13 == i16.j0) {
                            zzbagVar8.zzv(iZzc5 + 8);
                            fZzi = zzbagVar8.zzi() / zzbagVar8.zzi();
                            i9 = iZze11;
                            z3 = true;
                        } else if (iZze13 == i16.I0) {
                            int i26 = iZzc5 + 8;
                            while (true) {
                                if (i26 - iZzc5 >= iZze12) {
                                    i9 = iZze11;
                                    z2 = z3;
                                    bArrCopyOfRange = null;
                                    break;
                                }
                                zzbagVar8.zzv(i26);
                                int iZze14 = zzbagVar8.zze();
                                i9 = iZze11;
                                z2 = z3;
                                if (zzbagVar8.zze() == i16.J0) {
                                    bArrCopyOfRange = Arrays.copyOfRange(zzbagVar8.zza, i26, iZze14 + i26);
                                    break;
                                }
                                i26 += iZze14;
                                z3 = z2;
                                iZze11 = i9;
                            }
                            z3 = z2;
                            bArr = bArrCopyOfRange;
                        } else {
                            i9 = iZze11;
                            boolean z4 = z3;
                            if (iZze13 == i16.H0) {
                                int iZzg = zzbagVar8.zzg();
                                zzbagVar8.zzw(3);
                                if (iZzg == 0) {
                                    int iZzg2 = zzbagVar8.zzg();
                                    if (iZzg2 == 0) {
                                        z3 = z4;
                                        i25 = 0;
                                    } else if (iZzg2 == 1) {
                                        z3 = z4;
                                        i25 = 1;
                                    } else if (iZzg2 == 2) {
                                        z3 = z4;
                                        i25 = 2;
                                    } else if (iZzg2 == 3) {
                                        z3 = z4;
                                        i25 = 3;
                                    }
                                }
                            }
                            z3 = z4;
                        }
                        iZzc4 += iZze12;
                        iZze11 = i9;
                        obj2 = obj3;
                    }
                    i9 = iZze11;
                    iZzc4 += iZze12;
                    iZze11 = i9;
                    obj2 = obj3;
                }
                if (str13 != null) {
                    i6 = i5;
                    float f2 = fZzi;
                    i7 = i4;
                    int i27 = i25;
                    zzbagVar = zzbagVar8;
                    i8 = iZzc3;
                    wu5Var.d = zzass.zzl(Integer.toString(iZze3), str13, null, -1, -1, iZzj3, iZzj4, -1.0f, listSingletonList, i2, f2, bArr, i27, null, zzaurVar);
                } else {
                    i6 = i5;
                    i7 = i4;
                    zzbagVar = zzbagVar8;
                    i8 = iZzc3;
                }
                zzbag zzbagVar9 = zzbagVar;
                zzbagVar9.zzv(i8 + i6);
                i22 = i7 + 1;
                wu5Var4 = wu5Var;
                zzbagVar7 = zzbagVar9;
                i = i23;
                iZze9 = i3;
                str11 = str;
                pairCreate2 = pairCreate2;
                str10 = null;
                i17 = -1;
                i19 = 0;
            } else {
                if (iZze11 == i16.j || iZze11 == i16.b0 || iZze11 == i16.o || iZze11 == i16.q || iZze11 == i16.s || iZze11 == i16.v || iZze11 == i16.t || iZze11 == i16.u || iZze11 == i16.y0 || iZze11 == i16.z0 || iZze11 == i16.m || iZze11 == i16.n || iZze11 == i16.k || iZze11 == i16.O0) {
                    i10 = iZze10;
                    i11 = i22;
                    i3 = iZze9;
                    str2 = str11;
                    wu5Var2 = wu5Var4;
                    i12 = iZzc3;
                    zzbagVar7.zzv(i12 + 16);
                    if (z) {
                        iZzj = zzbagVar7.zzj();
                        zzbagVar7.zzw(6);
                    } else {
                        zzbagVar7.zzw(8);
                        iZzj = 0;
                    }
                    if (iZzj == 0 || iZzj == 1) {
                        int iZzj5 = zzbagVar7.zzj();
                        zzbagVar7.zzw(6);
                        int iZzh = zzbagVar7.zzh();
                        if (iZzj == 1) {
                            zzbagVar7.zzw(16);
                        }
                        iRound = iZzh;
                        iZzi = iZzj5;
                    } else if (iZzj == 2) {
                        zzbagVar7.zzw(16);
                        iRound = (int) Math.round(Double.longBitsToDouble(zzbagVar7.zzl()));
                        iZzi = zzbagVar7.zzi();
                        zzbagVar7.zzw(20);
                    }
                    int iZzc6 = zzbagVar7.zzc();
                    if (iZze11 == i16.b0) {
                        i13 = i11;
                        iZze11 = c(zzbagVar7, i12, i10, wu5Var2, i13);
                        zzbagVar7.zzv(iZzc6);
                    } else {
                        i13 = i11;
                    }
                    if (iZze11 == i16.o) {
                        str3 = "audio/ac3";
                    } else if (iZze11 == i16.q) {
                        str3 = "audio/eac3";
                    } else if (iZze11 == i16.s) {
                        str3 = "audio/vnd.dts";
                    } else if (iZze11 == i16.t || iZze11 == i16.u) {
                        str3 = "audio/vnd.dts.hd";
                    } else if (iZze11 == i16.v) {
                        str3 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iZze11 == i16.y0) {
                        str3 = "audio/3gpp";
                    } else if (iZze11 == i16.z0) {
                        str3 = "audio/amr-wb";
                    } else if (iZze11 == i16.m || iZze11 == i16.n) {
                        str3 = "audio/raw";
                    } else if (iZze11 == i16.k) {
                        str3 = "audio/mpeg";
                    } else {
                        str3 = iZze11 == i16.O0 ? "audio/alac" : null;
                    }
                    String str15 = str3;
                    int iIntValue = iZzi;
                    int iIntValue2 = iRound;
                    byte[] bArr2 = null;
                    while (iZzc6 - i12 < i10) {
                        zzbagVar7.zzv(iZzc6);
                        int iZze15 = zzbagVar7.zze();
                        zzazy.zzd(iZze15 > 0, str12);
                        int iZze16 = zzbagVar7.zze();
                        int i28 = i16.K;
                        if (iZze16 == i28 || (z && iZze16 == i16.l)) {
                            i14 = i13;
                            String str16 = str15;
                            i15 = i12;
                            String str17 = str12;
                            wu5Var3 = wu5Var2;
                            str4 = str2;
                            if (iZze16 != i28) {
                                iZzc = zzbagVar7.zzc();
                                while (true) {
                                    if (iZzc - iZzc6 >= iZze15) {
                                        str5 = str17;
                                        iZzc = -1;
                                        break;
                                    }
                                    zzbagVar7.zzv(iZzc);
                                    int iZze17 = zzbagVar7.zze();
                                    str5 = str17;
                                    zzazy.zzd(iZze17 > 0, str5);
                                    if (zzbagVar7.zze() == i16.K) {
                                        break;
                                    }
                                    iZzc += iZze17;
                                    str17 = str5;
                                }
                            } else {
                                iZzc = iZzc6;
                                str5 = str17;
                            }
                            if (iZzc != -1) {
                                Pair pairD2 = d(zzbagVar7, iZzc);
                                str15 = (String) pairD2.first;
                                byte[] bArr3 = (byte[]) pairD2.second;
                                if ("audio/mp4a-latm".equals(str15)) {
                                    Pair pairZza = zzazz.zza(bArr3);
                                    iIntValue2 = ((Integer) pairZza.first).intValue();
                                    iIntValue = ((Integer) pairZza.second).intValue();
                                }
                                bArr2 = bArr3;
                            } else {
                                str15 = str16;
                            }
                        } else {
                            if (iZze16 == i16.p) {
                                zzbagVar7.zzv(iZzc6 + 8);
                                str6 = str2;
                                wu5Var2.d = zzate.zzb(zzbagVar7, Integer.toString(iZze3), str6, zzaurVar);
                            } else {
                                str6 = str2;
                                if (iZze16 == i16.r) {
                                    zzbagVar7.zzv(iZzc6 + 8);
                                    wu5Var2.d = zzate.zzc(zzbagVar7, Integer.toString(iZze3), str6, zzaurVar);
                                } else {
                                    if (iZze16 == i16.w) {
                                        i16 = iZzc6;
                                        i14 = i13;
                                        str7 = str15;
                                        str4 = str6;
                                        i15 = i12;
                                        str8 = str12;
                                        wu5Var3 = wu5Var2;
                                        wu5Var3.d = zzass.zzg(Integer.toString(iZze3), str15, null, -1, -1, iIntValue, iIntValue2, null, zzaurVar, 0, str4);
                                        iZze15 = iZze15;
                                    } else {
                                        i16 = iZzc6;
                                        i14 = i13;
                                        str7 = str15;
                                        str4 = str6;
                                        i15 = i12;
                                        str8 = str12;
                                        wu5Var3 = wu5Var2;
                                        if (iZze16 == i16.O0) {
                                            byte[] bArr4 = new byte[iZze15];
                                            iZzc6 = i16;
                                            zzbagVar7.zzv(iZzc6);
                                            zzbagVar7.zzq(bArr4, 0, iZze15);
                                            bArr2 = bArr4;
                                        }
                                    }
                                    iZzc6 = i16;
                                }
                                str15 = str7;
                                str5 = str8;
                            }
                            i14 = i13;
                            str7 = str15;
                            str4 = str6;
                            i15 = i12;
                            str8 = str12;
                            wu5Var3 = wu5Var2;
                            str15 = str7;
                            str5 = str8;
                        }
                        iZzc6 += iZze15;
                        str12 = str5;
                        wu5Var2 = wu5Var3;
                        str2 = str4;
                        i13 = i14;
                        i12 = i15;
                        zzaurVar = zzaurVar;
                    }
                    int i29 = i13;
                    String str18 = str15;
                    int i30 = i12;
                    wu5 wu5Var5 = wu5Var2;
                    str = str2;
                    if (((zzass) wu5Var5.d) != null || str18 == null) {
                        zzbagVar2 = zzbagVar7;
                        wu5Var = wu5Var5;
                    } else {
                        int i31 = true != "audio/raw".equals(str18) ? -1 : 2;
                        zzbagVar2 = zzbagVar7;
                        wu5Var = wu5Var5;
                        wu5Var.d = zzass.zzh(Integer.toString(iZze3), str18, null, -1, -1, iIntValue, iIntValue2, i31, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), zzaurVar, 0, str, null);
                    }
                    zzbagVar = zzbagVar2;
                    i7 = i29;
                    i8 = i30;
                    i6 = i10;
                } else {
                    int i32 = i16.k0;
                    if (iZze11 == i32 || iZze11 == i16.u0 || iZze11 == i16.v0 || iZze11 == i16.w0 || iZze11 == i16.x0) {
                        zzbagVar7.zzv(iZzc3 + 16);
                        String str19 = "application/ttml+xml";
                        long j3 = Long.MAX_VALUE;
                        if (iZze11 != i32) {
                            if (iZze11 == i16.u0) {
                                int i33 = iZze10 - 16;
                                byte[] bArr5 = new byte[i33];
                                zzbagVar7.zzq(bArr5, i19, i33);
                                objSingletonList = Collections.singletonList(bArr5);
                                str19 = "application/x-quicktime-tx3g";
                            } else if (iZze11 == i16.v0) {
                                str19 = "application/x-mp4-vtt";
                                objSingletonList = str10;
                            } else if (iZze11 == i16.w0) {
                                objSingletonList = str10;
                                j3 = 0;
                            } else {
                                if (iZze11 != i16.x0) {
                                    throw new IllegalStateException();
                                }
                                wu5Var4.b = 1;
                                str9 = "application/x-mp4-cea-608";
                                obj = str10;
                            }
                            obj = objSingletonList;
                            str9 = str19;
                        } else {
                            objSingletonList = str10;
                            obj = objSingletonList;
                            str9 = str19;
                        }
                        i10 = iZze10;
                        i11 = i22;
                        i3 = iZze9;
                        str2 = str11;
                        zzass zzassVarZzk = zzass.zzk(Integer.toString(iZze3), str9, null, -1, 0, str11, -1, zzaurVar, j3, obj);
                        wu5Var2 = wu5Var4;
                        wu5Var2.d = zzassVarZzk;
                        i12 = iZzc3;
                    } else {
                        if (iZze11 == i16.N0) {
                            wu5Var4.d = zzass.zzj(Integer.toString(iZze3), "application/x-camera-motion", str10, i17, zzaurVar);
                        }
                        i10 = iZze10;
                        i12 = iZzc3;
                        i11 = i22;
                        i3 = iZze9;
                        str2 = str11;
                        wu5Var2 = wu5Var4;
                    }
                }
                i8 = i12;
                wu5Var = wu5Var2;
                zzbagVar = zzbagVar7;
                i6 = i10;
                pairCreate2 = pairCreate2;
                i7 = i11;
                str = str2;
            }
            zzbag zzbagVar10 = zzbagVar;
            zzbagVar10.zzv(i8 + i6);
            i22 = i7 + 1;
            wu5Var4 = wu5Var;
            zzbagVar7 = zzbagVar10;
            i = i23;
            iZze9 = i3;
            str11 = str;
            pairCreate2 = pairCreate2;
            str10 = null;
            i17 = -1;
            i19 = 0;
        }
        wu5 wu5Var6 = wu5Var4;
        int i34 = i;
        Pair pair = pairCreate2;
        g16 g16VarB3 = g16Var.b(i16.Q);
        if (g16VarB3 == null || (h16VarC = g16VarB3.c(i16.R)) == null) {
            zzawkVar = null;
            pairCreate = Pair.create(null, null);
        } else {
            zzbag zzbagVar11 = h16VarC.P0;
            zzbagVar11.zzv(8);
            int iZze18 = (zzbagVar11.zze() >> 24) & 255;
            int iZzi2 = zzbagVar11.zzi();
            long[] jArr = new long[iZzi2];
            long[] jArr2 = new long[iZzi2];
            for (int i35 = 0; i35 < iZzi2; i35++) {
                jArr[i35] = iZze18 == 1 ? zzbagVar11.zzn() : zzbagVar11.zzm();
                jArr2[i35] = iZze18 == 1 ? zzbagVar11.zzl() : zzbagVar11.zze();
                if (zzbagVar11.zzp() != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                zzbagVar11.zzw(2);
            }
            pairCreate = Pair.create(jArr, jArr2);
            zzawkVar = null;
        }
        return ((zzass) wu5Var6.d) == null ? zzawkVar : new zzawk(iZze3, i34, ((Long) pair.first).longValue(), jZzm2, jZzj, (zzass) wu5Var6.d, wu5Var6.b, (zzawl[]) wu5Var6.c, wu5Var6.a, (long[]) pairCreate.first, (long[]) pairCreate.second);
    }

    public static int b(zzbag zzbagVar) {
        int iZzg = zzbagVar.zzg();
        int i = iZzg & 127;
        while ((iZzg & 128) == 128) {
            iZzg = zzbagVar.zzg();
            i = (i << 7) | (iZzg & 127);
        }
        return i;
    }

    public static int c(zzbag zzbagVar, int i, int i2, wu5 wu5Var, int i3) {
        int iZzc = zzbagVar.zzc();
        while (true) {
            if (iZzc - i >= i2) {
                return 0;
            }
            zzbagVar.zzv(iZzc);
            int iZze = zzbagVar.zze();
            zzazy.zzd(iZze > 0, "childAtomSize should be positive");
            if (zzbagVar.zze() == i16.W) {
                int i4 = iZzc + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                zzawl zzawlVar = null;
                boolean z = false;
                while (i4 - iZzc < iZze) {
                    zzbagVar.zzv(i4);
                    int iZze2 = zzbagVar.zze();
                    int iZze3 = zzbagVar.zze();
                    if (iZze3 == i16.c0) {
                        numValueOf = Integer.valueOf(zzbagVar.zze());
                    } else if (iZze3 == i16.X) {
                        zzbagVar.zzw(4);
                        z = zzbagVar.zze() == g;
                    } else if (iZze3 == i16.Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= iZze2) {
                                zzawlVar = null;
                                break;
                            }
                            zzbagVar.zzv(i5);
                            int iZze4 = zzbagVar.zze();
                            if (zzbagVar.zze() == i16.Z) {
                                zzbagVar.zzw(6);
                                boolean z2 = zzbagVar.zzg() == 1;
                                int iZzg = zzbagVar.zzg();
                                byte[] bArr = new byte[16];
                                zzbagVar.zzq(bArr, 0, 16);
                                zzawlVar = new zzawl(z2, iZzg, bArr);
                                break;
                            }
                            i5 += iZze4;
                        }
                    }
                    i4 += iZze2;
                }
                if (z) {
                    zzazy.zzd(numValueOf != null, "frma atom is mandatory");
                    zzazy.zzd(zzawlVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, zzawlVar);
                }
                if (pairCreate != null) {
                    ((zzawl[]) wu5Var.c)[i3] = (zzawl) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            iZzc += iZze;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    public static Pair d(zzbag zzbagVar, int i) {
        String str;
        zzbagVar.zzv(i + 12);
        zzbagVar.zzw(1);
        b(zzbagVar);
        zzbagVar.zzw(2);
        int iZzg = zzbagVar.zzg();
        if ((iZzg & 128) != 0) {
            zzbagVar.zzw(2);
        }
        if ((iZzg & 64) != 0) {
            zzbagVar.zzw(zzbagVar.zzj());
        }
        if ((iZzg & 32) != 0) {
            zzbagVar.zzw(2);
        }
        zzbagVar.zzw(1);
        b(zzbagVar);
        int iZzg2 = zzbagVar.zzg();
        if (iZzg2 == 32) {
            str = "video/mp4v-es";
        } else if (iZzg2 == 33) {
            str = "video/avc";
        } else if (iZzg2 == 35) {
            str = "video/hevc";
        } else if (iZzg2 != 64) {
            str = null;
            if (iZzg2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iZzg2 == 165) {
                str = "audio/ac3";
            } else if (iZzg2 != 166) {
                switch (iZzg2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iZzg2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            } else {
                str = "audio/eac3";
            }
        } else {
            str = "audio/mp4a-latm";
        }
        zzbagVar.zzw(12);
        zzbagVar.zzw(1);
        int iB = b(zzbagVar);
        byte[] bArr = new byte[iB];
        zzbagVar.zzq(bArr, 0, iB);
        return Pair.create(str, bArr);
    }
}
