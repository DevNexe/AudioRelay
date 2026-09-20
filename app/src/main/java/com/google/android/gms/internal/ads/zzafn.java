package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import defpackage.bj0;
import defpackage.gv5;
import defpackage.hH;
import defpackage.kv5;
import defpackage.lv5;
import defpackage.mv5;
import defpackage.ov5;
import defpackage.su5;
import defpackage.tu5;
import defpackage.uu5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafn implements zzzf, zzaai {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzafk
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzafn(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final zzed a;
    public final zzed b;
    public final zzed c;
    public final zzed d;
    public final ArrayDeque e;
    public final ArrayList f;
    public int g;
    public int h;
    public long i;
    public int j;
    public zzed k;
    public int l;
    public int m;
    public int n;
    public int o;
    public zzzi p;
    public lv5[] q;
    public long[][] r;
    public int s;
    public long t;
    public int u;

    public zzafn() {
        this(0);
    }

    public final void a() {
        this.g = 0;
        this.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x032c A[Catch: all -> 0x02be, TRY_LEAVE, TryCatch #0 {all -> 0x02be, blocks: (B:38:0x00df, B:42:0x00e9, B:45:0x00f3, B:46:0x00fb, B:49:0x0107, B:52:0x0114, B:55:0x0121, B:58:0x0130, B:61:0x013e, B:63:0x014b, B:71:0x0164, B:73:0x0176, B:74:0x018b, B:77:0x0199, B:80:0x01a6, B:83:0x01b3, B:86:0x01c0, B:89:0x01cd, B:92:0x01da, B:95:0x01e7, B:98:0x01f5, B:101:0x0204, B:104:0x0211, B:108:0x0223, B:110:0x0229, B:112:0x0240, B:115:0x024c, B:122:0x025e, B:128:0x026c, B:169:0x032c, B:130:0x0285, B:132:0x028c, B:134:0x0299, B:135:0x02ae, B:150:0x02de, B:153:0x02eb, B:156:0x02f7, B:159:0x0303, B:162:0x030f, B:165:0x031b, B:168:0x0325, B:171:0x0344, B:172:0x034b), top: B:337:0x00df }] */
    /* JADX WARN: Code duplicated, block: B:248:0x050c  */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x032c, please report this as an issue */
    public final void b(long j) {
        zzafn zzafnVar;
        ArrayDeque arrayDeque;
        ArrayList arrayList;
        zzbq zzbqVar;
        zzbq zzbqVar2;
        zzbq zzbqVar3;
        zzbq zzbqVar4;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        zzadn zzadnVar;
        ArrayDeque arrayDeque2;
        ArrayList arrayList3;
        zzbq zzbqVar5;
        Parcelable parcelableD;
        Parcelable zzactVar;
        String str;
        zzafn zzafnVar2 = this;
        while (true) {
            ArrayDeque arrayDeque3 = zzafnVar2.e;
            if (arrayDeque3.isEmpty() || ((su5) arrayDeque3.peek()).b != j) {
                break;
            }
            su5 su5Var = (su5) arrayDeque3.pop();
            if (su5Var.a == 1836019574) {
                ArrayList arrayList4 = new ArrayList();
                boolean z = zzafnVar2.u == 1;
                zzzu zzzuVar = new zzzu();
                tu5 tu5VarC = su5Var.c(1969517665);
                int i4 = 1768715124;
                int i5 = 1751411826;
                int i6 = 1835365473;
                int i7 = 4;
                int i8 = 8;
                if (tu5VarC != null) {
                    byte[] bArr = gv5.a;
                    zzed zzedVar = tu5VarC.b;
                    zzedVar.zzF(8);
                    zzbq zzbqVar6 = null;
                    zzbq zzbqVar7 = null;
                    while (zzedVar.zza() >= i8) {
                        int iZzc = zzedVar.zzc();
                        int iZze = zzedVar.zze();
                        int i9 = i4;
                        int iZze2 = zzedVar.zze();
                        if (iZze2 != i6) {
                            arrayDeque2 = arrayDeque3;
                            arrayList3 = arrayList4;
                            if (iZze2 == 1936553057) {
                                zzedVar.zzF(iZzc);
                                int i10 = iZzc + iZze;
                                zzedVar.zzG(12);
                                while (true) {
                                    if (zzedVar.zzc() < i10) {
                                        int iZzc2 = zzedVar.zzc();
                                        int iZze3 = zzedVar.zze();
                                        if (zzedVar.zze() == 1935766900) {
                                            if (iZze3 >= 14) {
                                                zzedVar.zzG(5);
                                                int iZzk = zzedVar.zzk();
                                                if (iZzk == 12) {
                                                    float f = iZzk == 12 ? 240.0f : 120.0f;
                                                    zzedVar.zzG(1);
                                                    zzbqVar7 = new zzbq(new zzadt(f, zzedVar.zzk()));
                                                    break;
                                                }
                                                if (iZzk != 13) {
                                                }
                                                zzedVar.zzG(1);
                                                zzbqVar7 = new zzbq(new zzadt(f, zzedVar.zzk()));
                                                break;
                                                break;
                                            }
                                        } else {
                                            zzedVar.zzF(iZzc2 + iZze3);
                                        }
                                    }
                                    zzbqVar7 = null;
                                    break;
                                }
                            }
                        } else {
                            zzedVar.zzF(iZzc);
                            int i11 = iZzc + iZze;
                            zzedVar.zzG(i8);
                            int iZzc3 = zzedVar.zzc();
                            zzedVar.zzG(i7);
                            if (zzedVar.zze() != i5) {
                                iZzc3 += 4;
                            }
                            zzedVar.zzF(iZzc3);
                            int i12 = i9;
                            while (true) {
                                if (zzedVar.zzc() < i11) {
                                    int iZzc4 = zzedVar.zzc();
                                    int iZze4 = zzedVar.zze();
                                    if (zzedVar.zze() == i12) {
                                        zzedVar.zzF(iZzc4);
                                        int i13 = iZzc4 + iZze4;
                                        zzedVar.zzG(i8);
                                        ArrayList arrayList5 = new ArrayList();
                                        while (zzedVar.zzc() < i13) {
                                            int iZze5 = zzedVar.zze() + zzedVar.zzc();
                                            int iZze6 = zzedVar.zze();
                                            int i14 = i13;
                                            int i15 = (iZze6 >> 24) & 255;
                                            ArrayDeque arrayDeque4 = arrayDeque3;
                                            ArrayList arrayList6 = arrayList4;
                                            if (i15 == 169 || i15 == 253) {
                                                int i16 = iZze6 & 16777215;
                                                if (i16 == 6516084) {
                                                    int iZze7 = zzedVar.zze();
                                                    if (zzedVar.zze() == 1684108385) {
                                                        zzedVar.zzG(8);
                                                        String strZzw = zzedVar.zzw(iZze7 - 16);
                                                        zzactVar = new zzact("und", strZzw, strZzw);
                                                    } else {
                                                        Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(uu5.a(iZze6)));
                                                        parcelableD = null;
                                                    }
                                                    zzedVar.zzF(iZze5);
                                                } else if (i16 == 7233901 || i16 == 7631467) {
                                                    parcelableD = kv5.d(iZze6, "TIT2", zzedVar);
                                                } else if (i16 == 6516589 || i16 == 7828084) {
                                                    parcelableD = kv5.d(iZze6, "TCOM", zzedVar);
                                                } else if (i16 == 6578553) {
                                                    parcelableD = kv5.d(iZze6, "TDRC", zzedVar);
                                                } else if (i16 == 4280916) {
                                                    parcelableD = kv5.d(iZze6, "TPE1", zzedVar);
                                                } else if (i16 == 7630703) {
                                                    parcelableD = kv5.d(iZze6, "TSSE", zzedVar);
                                                } else if (i16 == 6384738) {
                                                    parcelableD = kv5.d(iZze6, "TALB", zzedVar);
                                                } else if (i16 == 7108978) {
                                                    parcelableD = kv5.d(iZze6, "USLT", zzedVar);
                                                } else if (i16 == 6776174) {
                                                    parcelableD = kv5.d(iZze6, "TCON", zzedVar);
                                                } else if (i16 == 6779504) {
                                                    parcelableD = kv5.d(iZze6, "TIT1", zzedVar);
                                                } else {
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + uu5.a(iZze6));
                                                    zzedVar.zzF(iZze5);
                                                    zzactVar = null;
                                                }
                                                zzactVar = parcelableD;
                                                zzedVar.zzF(iZze5);
                                            } else {
                                                if (iZze6 == 1735291493) {
                                                    try {
                                                        int iA = kv5.a(zzedVar);
                                                        String str2 = (iA <= 0 || iA > 192) ? null : kv5.a[iA - 1];
                                                        if (str2 != null) {
                                                            zzactVar = new zzadi("TCON", null, str2);
                                                        } else {
                                                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                            parcelableD = null;
                                                            zzactVar = parcelableD;
                                                        }
                                                    } catch (Throwable th) {
                                                        zzedVar.zzF(iZze5);
                                                        throw th;
                                                    }
                                                } else if (iZze6 == 1684632427) {
                                                    zzactVar = kv5.c(1684632427, "TPOS", zzedVar);
                                                } else if (iZze6 == 1953655662) {
                                                    zzactVar = kv5.c(1953655662, "TRCK", zzedVar);
                                                } else if (iZze6 == 1953329263) {
                                                    zzactVar = kv5.b(1953329263, "TBPM", zzedVar, true, false);
                                                } else if (iZze6 == 1668311404) {
                                                    zzactVar = kv5.b(1668311404, "TCMP", zzedVar, true, true);
                                                } else if (iZze6 == 1668249202) {
                                                    int iZze8 = zzedVar.zze();
                                                    if (zzedVar.zze() == 1684108385) {
                                                        int iZze9 = zzedVar.zze() & 16777215;
                                                        if (iZze9 == 13) {
                                                            str = "image/jpeg";
                                                        } else if (iZze9 == 14) {
                                                            str = "image/png";
                                                            iZze9 = 14;
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (str == null) {
                                                            Log.w("MetadataUtil", "Unrecognized cover art flags: " + iZze9);
                                                            parcelableD = null;
                                                            zzactVar = parcelableD;
                                                        } else {
                                                            zzedVar.zzG(4);
                                                            int i17 = iZze8 - 16;
                                                            byte[] bArr2 = new byte[i17];
                                                            zzedVar.zzB(bArr2, 0, i17);
                                                            zzactVar = new zzacl(str, null, 3, bArr2);
                                                        }
                                                    } else {
                                                        parcelableD = null;
                                                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                        zzactVar = parcelableD;
                                                    }
                                                } else {
                                                    String strZzw2 = null;
                                                    if (iZze6 == 1631670868) {
                                                        zzactVar = kv5.d(1631670868, "TPE2", zzedVar);
                                                    } else if (iZze6 == 1936682605) {
                                                        zzactVar = kv5.d(1936682605, "TSOT", zzedVar);
                                                    } else if (iZze6 == 1936679276) {
                                                        zzactVar = kv5.d(1936679276, "TSO2", zzedVar);
                                                    } else if (iZze6 == 1936679282) {
                                                        zzactVar = kv5.d(1936679282, "TSOA", zzedVar);
                                                    } else if (iZze6 == 1936679265) {
                                                        zzactVar = kv5.d(1936679265, "TSOP", zzedVar);
                                                    } else if (iZze6 == 1936679791) {
                                                        zzactVar = kv5.d(1936679791, "TSOC", zzedVar);
                                                    } else if (iZze6 == 1920233063) {
                                                        zzactVar = kv5.b(1920233063, "ITUNESADVISORY", zzedVar, false, false);
                                                    } else if (iZze6 == 1885823344) {
                                                        zzactVar = kv5.b(1885823344, "ITUNESGAPLESS", zzedVar, false, true);
                                                    } else if (iZze6 == 1936683886) {
                                                        zzactVar = kv5.d(1936683886, "TVSHOWSORT", zzedVar);
                                                    } else if (iZze6 == 1953919848) {
                                                        zzactVar = kv5.d(1953919848, "TVSHOW", zzedVar);
                                                    } else if (iZze6 == 757935405) {
                                                        String strZzw3 = null;
                                                        int i18 = -1;
                                                        int i19 = -1;
                                                        while (zzedVar.zzc() < iZze5) {
                                                            int iZzc5 = zzedVar.zzc();
                                                            int iZze10 = zzedVar.zze();
                                                            int iZze11 = zzedVar.zze();
                                                            zzedVar.zzG(4);
                                                            if (iZze11 == 1835360622) {
                                                                strZzw2 = zzedVar.zzw(iZze10 - 12);
                                                            } else if (iZze11 == 1851878757) {
                                                                strZzw3 = zzedVar.zzw(iZze10 - 12);
                                                            } else {
                                                                if (iZze11 == 1684108385) {
                                                                    i19 = iZze10;
                                                                }
                                                                if (iZze11 == 1684108385) {
                                                                    i18 = iZzc5;
                                                                }
                                                                zzedVar.zzG(iZze10 - 12);
                                                            }
                                                        }
                                                        if (strZzw2 == null || strZzw3 == null || i18 == -1) {
                                                            zzactVar = null;
                                                        } else {
                                                            zzedVar.zzF(i18);
                                                            zzedVar.zzG(16);
                                                            zzactVar = new zzadc(strZzw2, strZzw3, zzedVar.zzw(i19 - 16));
                                                        }
                                                    } else {
                                                        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + uu5.a(iZze6));
                                                        zzedVar.zzF(iZze5);
                                                        zzactVar = null;
                                                    }
                                                }
                                                zzedVar.zzF(iZze5);
                                            }
                                            if (zzactVar != null) {
                                                arrayList5.add(zzactVar);
                                            }
                                            i13 = i14;
                                            arrayDeque3 = arrayDeque4;
                                            arrayList4 = arrayList6;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        arrayList3 = arrayList4;
                                        if (!arrayList5.isEmpty()) {
                                            zzbqVar5 = new zzbq(arrayList5);
                                            break;
                                        }
                                        break;
                                    }
                                    zzedVar.zzF(iZzc4 + iZze4);
                                    i12 = 1768715124;
                                    i8 = 8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    arrayList3 = arrayList4;
                                }
                                zzbqVar5 = null;
                                break;
                            }
                            zzbqVar6 = zzbqVar5;
                        }
                        zzedVar.zzF(iZzc + iZze);
                        i7 = 4;
                        i4 = 1768715124;
                        i5 = 1751411826;
                        i6 = 1835365473;
                        i8 = 8;
                        arrayDeque3 = arrayDeque2;
                        arrayList4 = arrayList3;
                    }
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList4;
                    Pair pairCreate = Pair.create(zzbqVar6, zzbqVar7);
                    zzbqVar2 = (zzbq) pairCreate.first;
                    zzbqVar = (zzbq) pairCreate.second;
                    if (zzbqVar2 != null) {
                        zzzuVar.zzb(zzbqVar2);
                    }
                } else {
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList4;
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                su5 su5VarB = su5Var.b(1835365473);
                if (su5VarB != null) {
                    byte[] bArr3 = gv5.a;
                    tu5 tu5VarC2 = su5VarB.c(1751411826);
                    tu5 tu5VarC3 = su5VarB.c(1801812339);
                    tu5 tu5VarC4 = su5VarB.c(1768715124);
                    if (tu5VarC2 == null || tu5VarC3 == null || tu5VarC4 == null) {
                        zzbqVar3 = null;
                    } else {
                        zzed zzedVar2 = tu5VarC2.b;
                        zzedVar2.zzF(16);
                        if (zzedVar2.zze() != 1835299937) {
                            zzbqVar3 = null;
                        } else {
                            zzed zzedVar3 = tu5VarC3.b;
                            zzedVar3.zzF(12);
                            int iZze12 = zzedVar3.zze();
                            String[] strArr = new String[iZze12];
                            for (int i20 = 0; i20 < iZze12; i20++) {
                                int iZze13 = zzedVar3.zze();
                                zzedVar3.zzG(4);
                                strArr[i20] = zzedVar3.zzx(iZze13 - 8, zzfrs.zzc);
                            }
                            zzed zzedVar4 = tu5VarC4.b;
                            int i21 = 8;
                            zzedVar4.zzF(8);
                            ArrayList arrayList7 = new ArrayList();
                            while (zzedVar4.zza() > i21) {
                                int iZzc6 = zzedVar4.zzc();
                                int iZze14 = zzedVar4.zze();
                                int iZze15 = zzedVar4.zze() - 1;
                                if (iZze15 < 0 || iZze15 >= iZze12) {
                                    i3 = iZze12;
                                    bj0.b("Skipped metadata with unknown key index: ", iZze15, "AtomParsers");
                                } else {
                                    String str3 = strArr[iZze15];
                                    int i22 = iZzc6 + iZze14;
                                    while (true) {
                                        int iZzc7 = zzedVar4.zzc();
                                        if (iZzc7 >= i22) {
                                            i3 = iZze12;
                                            zzadnVar = null;
                                            break;
                                        }
                                        int iZze16 = zzedVar4.zze();
                                        i3 = iZze12;
                                        if (zzedVar4.zze() == 1684108385) {
                                            int iZze17 = zzedVar4.zze();
                                            int iZze18 = zzedVar4.zze();
                                            int i23 = iZze16 - 16;
                                            byte[] bArr4 = new byte[i23];
                                            zzedVar4.zzB(bArr4, 0, i23);
                                            zzadnVar = new zzadn(str3, bArr4, iZze18, iZze17);
                                            break;
                                        }
                                        zzedVar4.zzF(iZzc7 + iZze16);
                                        iZze12 = i3;
                                    }
                                    if (zzadnVar != null) {
                                        arrayList7.add(zzadnVar);
                                    }
                                }
                                zzedVar4.zzF(iZzc6 + iZze14);
                                i21 = 8;
                                iZze12 = i3;
                            }
                            if (arrayList7.isEmpty()) {
                                zzbqVar3 = null;
                            } else {
                                zzbqVar3 = new zzbq(arrayList7);
                            }
                        }
                    }
                } else {
                    zzbqVar3 = null;
                }
                long j2 = -9223372036854775807L;
                ArrayList arrayListA = gv5.a(su5Var, zzzuVar, -9223372036854775807L, null, z, new zzfru() { // from class: com.google.android.gms.internal.ads.zzafl
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        zzafs zzafsVar = (zzafs) obj;
                        zzzm zzzmVar = zzafn.zza;
                        return zzafsVar;
                    }
                });
                int i24 = 0;
                int size = -1;
                for (int size2 = arrayListA.size(); i24 < size2; size2 = size2) {
                    ov5 ov5Var = (ov5) arrayListA.get(i24);
                    if (ov5Var.b == 0) {
                        arrayList2 = arrayList;
                    } else {
                        zzafs zzafsVar = ov5Var.a;
                        long j3 = zzafsVar.zze;
                        if (j3 == -9223372036854775807L) {
                            j3 = ov5Var.h;
                        }
                        long jMax = Math.max(j2, j3);
                        lv5 lv5Var = new lv5(zzafsVar, ov5Var, this.p.zzv(i24, zzafsVar.zzb));
                        boolean zEquals = "audio/true-hd".equals(zzafsVar.zzf.zzm);
                        int i25 = ov5Var.e;
                        int i26 = zEquals ? i25 * 16 : i25 + 30;
                        zzad zzadVarZzb = zzafsVar.zzf.zzb();
                        zzadVarZzb.zzL(i26);
                        if (zzafsVar.zzb == 2 && j3 > 0 && (i2 = ov5Var.b) > 1) {
                            zzadVarZzb.zzE(i2 / (j3 / 1000000.0f));
                        }
                        if (zzafsVar.zzb == 1 && zzzuVar.zza()) {
                            zzadVarZzb.zzC(zzzuVar.zza);
                            zzadVarZzb.zzD(zzzuVar.zzb);
                        }
                        int i27 = zzafsVar.zzb;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar;
                        ArrayList arrayList8 = this.f;
                        if (arrayList8.isEmpty()) {
                            i = 1;
                            zzbqVar4 = null;
                        } else {
                            zzbqVar4 = new zzbq(arrayList8);
                            i = 1;
                        }
                        zzbqVarArr[i] = zzbqVar4;
                        zzbq zzbqVar8 = new zzbq(new zzbp[0]);
                        if (i27 == i) {
                            if (zzbqVar2 != null) {
                                zzbqVar8 = zzbqVar2;
                            }
                        } else if (i27 == 2 && zzbqVar3 != null) {
                            for (int i28 = 0; i28 < zzbqVar3.zza(); i28++) {
                                zzbp zzbpVarZzb = zzbqVar3.zzb(i28);
                                if (zzbpVarZzb instanceof zzadn) {
                                    zzadn zzadnVar2 = (zzadn) zzbpVarZzb;
                                    if ("com.android.capture.fps".equals(zzadnVar2.zza)) {
                                        zzbqVar8 = new zzbq(zzadnVar2);
                                        break;
                                    }
                                }
                            }
                        }
                        for (int i29 = 0; i29 < 2; i29++) {
                            zzbqVar8 = zzbqVar8.zzd(zzbqVarArr[i29]);
                        }
                        if (zzbqVar8.zza() > 0) {
                            zzadVarZzb.zzM(zzbqVar8);
                        }
                        lv5Var.c.zzk(zzadVarZzb.zzY());
                        if (zzafsVar.zzb == 2 && size == -1) {
                            size = arrayList.size();
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(lv5Var);
                        j2 = jMax;
                    }
                    i24++;
                    arrayList = arrayList2;
                    arrayListA = arrayListA;
                }
                zzafnVar = this;
                long j4 = 0;
                zzafnVar.s = size;
                zzafnVar.t = j2;
                lv5[] lv5VarArr = (lv5[]) arrayList.toArray(new lv5[0]);
                zzafnVar.q = lv5VarArr;
                int length = lv5VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i30 = 0; i30 < lv5VarArr.length; i30++) {
                    jArr[i30] = new long[lv5VarArr[i30].b.b];
                    jArr2[i30] = lv5VarArr[i30].b.f[0];
                }
                int i31 = 0;
                while (i31 < lv5VarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i32 = -1;
                    for (int i33 = 0; i33 < lv5VarArr.length; i33++) {
                        if (!zArr[i33]) {
                            long j6 = jArr2[i33];
                            if (j6 <= j5) {
                                i32 = i33;
                                j5 = j6;
                            }
                        }
                    }
                    int i34 = iArr[i32];
                    long[] jArr3 = jArr[i32];
                    jArr3[i34] = j4;
                    ov5 ov5Var2 = lv5VarArr[i32].b;
                    j4 += (long) ov5Var2.d[i34];
                    int i35 = i34 + 1;
                    iArr[i32] = i35;
                    if (i35 < jArr3.length) {
                        jArr2[i32] = ov5Var2.f[i35];
                    } else {
                        zArr[i32] = true;
                        i31++;
                    }
                }
                zzafnVar.r = jArr;
                zzafnVar.p.zzB();
                zzafnVar.p.zzL(zzafnVar);
                arrayDeque.clear();
                zzafnVar.g = 2;
            } else {
                zzafnVar = zzafnVar2;
                if (!arrayDeque3.isEmpty()) {
                    ((su5) arrayDeque3.peek()).d.add(su5Var);
                }
            }
            zzafnVar2 = zzafnVar;
        }
        if (zzafnVar2.g != 2) {
            a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:276:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) {
        boolean z;
        boolean z2;
        int i;
        while (true) {
            int i2 = this.g;
            ArrayDeque arrayDeque = this.e;
            zzed zzedVar = this.c;
            if (i2 == 0) {
                int i3 = this.j;
                zzed zzedVar2 = this.d;
                if (i3 == 0) {
                    if (!zzzgVar.zzn(zzedVar2.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.j = 8;
                    zzedVar2.zzF(0);
                    this.i = zzedVar2.zzs();
                    this.h = zzedVar2.zze();
                }
                long j = this.i;
                if (j == 1) {
                    zzzgVar.zzi(zzedVar2.zzH(), 8, 8);
                    this.j += 8;
                    this.i = zzedVar2.zzt();
                } else if (j == 0) {
                    long jZzd = zzzgVar.zzd();
                    if (jZzd == -1) {
                        su5 su5Var = (su5) arrayDeque.peek();
                        jZzd = su5Var != null ? su5Var.b : -1L;
                    }
                    if (jZzd != -1) {
                        this.i = (jZzd - zzzgVar.zzf()) + ((long) this.j);
                    }
                }
                long j2 = this.i;
                int i4 = this.j;
                if (j2 < i4) {
                    throw zzbu.zzc("Atom size less than header length (unsupported).");
                }
                int i5 = this.h;
                if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1701082227 || i5 == 1835365473) {
                    long jZzf = zzzgVar.zzf();
                    long j3 = this.i;
                    long j4 = this.j;
                    long j5 = (jZzf + j3) - j4;
                    if (j3 != j4 && this.h == 1835365473) {
                        zzedVar.zzC(8);
                        zzzgVar.zzh(zzedVar.zzH(), 0, 8);
                        byte[] bArr = gv5.a;
                        int iZzc = zzedVar.zzc();
                        zzedVar.zzG(4);
                        if (zzedVar.zze() != 1751411826) {
                            iZzc += 4;
                        }
                        zzedVar.zzF(iZzc);
                        zzzgVar.zzk(zzedVar.zzc());
                        zzzgVar.zzj();
                    }
                    arrayDeque.push(new su5(this.h, j5));
                    if (this.i == this.j) {
                        b(j5);
                    } else {
                        a();
                    }
                } else if (i5 == 1835296868 || i5 == 1836476516 || i5 == 1751411826 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1937011571 || i5 == 1668576371 || i5 == 1701606260 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1953196132 || i5 == 1718909296 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                    zzdd.zzf(i4 == 8);
                    zzdd.zzf(this.i <= 2147483647L);
                    zzed zzedVar3 = new zzed((int) this.i);
                    System.arraycopy(zzedVar2.zzH(), 0, zzedVar3.zzH(), 0, 8);
                    this.k = zzedVar3;
                    this.g = 1;
                } else {
                    long jZzf2 = zzzgVar.zzf();
                    long j6 = this.j;
                    long j7 = jZzf2 - j6;
                    if (this.h == 1836086884) {
                        new zzadq(0L, j7, -9223372036854775807L, j7 + j6, this.i - j6);
                    }
                    this.k = null;
                    this.g = 1;
                }
            } else {
                if (i2 != 1) {
                    long jZzf3 = zzzgVar.zzf();
                    int i6 = this.l;
                    if (i6 == -1) {
                        long j8 = Long.MAX_VALUE;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        int i7 = 0;
                        boolean z3 = true;
                        int i8 = -1;
                        int i9 = -1;
                        boolean z4 = true;
                        while (true) {
                            lv5[] lv5VarArr = this.q;
                            if (i7 >= lv5VarArr.length) {
                                break;
                            }
                            lv5 lv5Var = lv5VarArr[i7];
                            int i10 = lv5Var.e;
                            ov5 ov5Var = lv5Var.b;
                            if (i10 != ov5Var.b) {
                                long j11 = ov5Var.c[i10];
                                long j12 = ((long[][]) zzel.zzH(this.r))[i7][i10];
                                long j13 = j11 - jZzf3;
                                boolean z5 = j13 < 0 || j13 >= 262144;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        i9 = i7;
                                        j10 = j13;
                                        j9 = j12;
                                    } else {
                                        z = false;
                                    }
                                    if (j12 < j8) {
                                        z3 = z5;
                                        i8 = i7;
                                        j8 = j12;
                                    }
                                }
                                if (z5 != z || j13 >= j10) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i9 = i7;
                                    j10 = j13;
                                    j9 = j12;
                                }
                                if (j12 < j8) {
                                    z3 = z5;
                                    i8 = i7;
                                    j8 = j12;
                                }
                            }
                            i7++;
                        }
                        i6 = (j8 == Long.MAX_VALUE || !z3 || j9 < j8 + 10485760) ? i9 : i8;
                        this.l = i6;
                        if (i6 == -1) {
                            return -1;
                        }
                    }
                    lv5 lv5Var2 = this.q[i6];
                    zzaam zzaamVar = lv5Var2.c;
                    int i11 = lv5Var2.e;
                    ov5 ov5Var2 = lv5Var2.b;
                    long j14 = ov5Var2.c[i11];
                    int i12 = ov5Var2.d[i11];
                    long j15 = (j14 - jZzf3) + ((long) this.m);
                    if (j15 < 0 || j15 >= 262144) {
                        zzaafVar.zza = j14;
                        return 1;
                    }
                    zzafs zzafsVar = lv5Var2.a;
                    if (zzafsVar.zzg == 1) {
                        j15 += 8;
                        i12 -= 8;
                    }
                    zzzgVar.zzk((int) j15);
                    int i13 = zzafsVar.zzj;
                    zzaan zzaanVar = lv5Var2.d;
                    if (i13 == 0) {
                        if ("audio/ac4".equals(zzafsVar.zzf.zzm)) {
                            if (this.n == 0) {
                                zzyj.zzb(i12, zzedVar);
                                zzaamVar.zzq(zzedVar, 7);
                                this.n += 7;
                            }
                            i12 += 7;
                        } else if (zzaanVar != null) {
                            zzaanVar.zzd(zzzgVar);
                        }
                        while (true) {
                            int i14 = this.n;
                            if (i14 >= i12) {
                                break;
                            }
                            int iZze = zzaamVar.zze(zzzgVar, i12 - i14, false);
                            this.m += iZze;
                            this.n += iZze;
                            this.o -= iZze;
                        }
                    } else {
                        zzed zzedVar4 = this.b;
                        byte[] bArrZzH = zzedVar4.zzH();
                        bArrZzH[0] = 0;
                        bArrZzH[1] = 0;
                        bArrZzH[2] = 0;
                        int i15 = 4 - i13;
                        while (this.n < i12) {
                            int i16 = this.o;
                            if (i16 == 0) {
                                zzzgVar.zzi(bArrZzH, i15, i13);
                                this.m += i13;
                                zzedVar4.zzF(0);
                                int iZze2 = zzedVar4.zze();
                                if (iZze2 < 0) {
                                    throw zzbu.zza("Invalid NAL length", null);
                                }
                                this.o = iZze2;
                                zzed zzedVar5 = this.a;
                                zzedVar5.zzF(0);
                                zzaamVar.zzq(zzedVar5, 4);
                                this.n += 4;
                                i12 += i15;
                            } else {
                                int iZze3 = zzaamVar.zze(zzzgVar, i16, false);
                                this.m += iZze3;
                                this.n += iZze3;
                                this.o -= iZze3;
                            }
                        }
                    }
                    long j16 = ov5Var2.f[i11];
                    int i17 = ov5Var2.g[i11];
                    if (zzaanVar != null) {
                        zzaanVar.zzc(zzaamVar, j16, i17, i12, 0, null);
                        if (i11 + 1 == ov5Var2.b) {
                            zzaanVar.zza(zzaamVar, null);
                        }
                    } else {
                        zzaamVar.zzs(j16, i17, i12, 0, null);
                    }
                    lv5Var2.e++;
                    this.l = -1;
                    this.m = 0;
                    this.n = 0;
                    this.o = 0;
                    return 0;
                }
                long j17 = this.i - ((long) this.j);
                long jZzf4 = zzzgVar.zzf() + j17;
                zzed zzedVar6 = this.k;
                if (zzedVar6 != null) {
                    zzzgVar.zzi(zzedVar6.zzH(), this.j, (int) j17);
                    if (this.h == 1718909296) {
                        zzedVar6.zzF(8);
                        int iZze4 = zzedVar6.zze();
                        if (iZze4 != 1751476579) {
                            i = iZze4 != 1903435808 ? 0 : 1;
                        } else {
                            i = 2;
                        }
                        if (i == 0) {
                            zzedVar6.zzG(4);
                            do {
                                if (zzedVar6.zza() <= 0) {
                                    i = 0;
                                    break;
                                }
                                int iZze5 = zzedVar6.zze();
                                if (iZze5 != 1751476579) {
                                    i = iZze5 != 1903435808 ? 0 : 1;
                                } else {
                                    i = 2;
                                }
                            } while (i == 0);
                        }
                        this.u = i;
                    } else if (!arrayDeque.isEmpty()) {
                        ((su5) arrayDeque.peek()).c.add(new tu5(this.h, zzedVar6));
                    }
                } else {
                    if (j17 < 262144) {
                        zzzgVar.zzk((int) j17);
                    } else {
                        zzaafVar.zza = zzzgVar.zzf() + j17;
                        z2 = true;
                    }
                    b(jZzf4);
                    if (z2 && this.g != 2) {
                        return 1;
                    }
                }
                z2 = false;
                b(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.p = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.e.clear();
        this.j = 0;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        if (j == 0) {
            a();
            return;
        }
        for (lv5 lv5Var : this.q) {
            ov5 ov5Var = lv5Var.b;
            int iZzd = zzel.zzd(ov5Var.f, j2, true, false);
            while (true) {
                if (iZzd < 0) {
                    iZzd = -1;
                    break;
                } else if ((ov5Var.g[iZzd] & 1) != 0) {
                    break;
                } else {
                    iZzd--;
                }
            }
            if (iZzd == -1) {
                iZzd = ov5Var.a(j2);
            }
            lv5Var.e = iZzd;
            zzaan zzaanVar = lv5Var.d;
            if (zzaanVar != null) {
                zzaanVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        return hH.G(zzzgVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[LOOP:2: B:34:0x0084->B:38:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be A[LOOP:3: B:48:0x00b4->B:52:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6 A[PHI: r10
  0x00d6: PHI (r10v2 long) = (r10v1 long), (r10v4 long) binds: [B:32:0x0078, B:46:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc A[EDGE_INSN: B:69:0x00dc->B:61:0x00dc BREAK  A[LOOP:1: B:29:0x0071->B:60:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0092 A[EDGE_INSN: B:74:0x0092->B:40:0x0092 BREAK  A[LOOP:2: B:34:0x0084->B:38:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c3 A[EDGE_INSN: B:76:0x00c3->B:54:0x00c3 BREAK  A[LOOP:3: B:48:0x00b4->B:52:0x00be], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        long j2;
        long j3;
        long j4;
        long jMin;
        long jMin2;
        int i;
        lv5[] lv5VarArr;
        zzaaj zzaajVar;
        zzaag zzaagVar;
        ov5 ov5Var;
        int iZzd;
        int iZzd2;
        int iA;
        lv5[] lv5VarArr2 = this.q;
        if (lv5VarArr2.length == 0) {
            zzaaj zzaajVar2 = zzaaj.zza;
            return new zzaag(zzaajVar2, zzaajVar2);
        }
        int i2 = this.s;
        boolean z = false;
        boolean z2 = 1;
        if (i2 != -1) {
            ov5 ov5Var2 = lv5VarArr2[i2].b;
            int iZzd3 = zzel.zzd(ov5Var2.f, j, true, false);
            while (true) {
                if (iZzd3 < 0) {
                    iZzd3 = -1;
                    break;
                }
                if ((ov5Var2.g[iZzd3] & 1) != 0) {
                    break;
                }
                iZzd3--;
            }
            if (iZzd3 == -1) {
                iZzd3 = ov5Var2.a(j);
            }
            if (iZzd3 == -1) {
                zzaaj zzaajVar3 = zzaaj.zza;
                return new zzaag(zzaajVar3, zzaajVar3);
            }
            long[] jArr = ov5Var2.f;
            j3 = jArr[iZzd3];
            long[] jArr2 = ov5Var2.c;
            j2 = jArr2[iZzd3];
            if (j3 < j && iZzd3 < ov5Var2.b - 1 && (iA = ov5Var2.a(j)) != -1 && iA != iZzd3) {
                j4 = jArr[iA];
                jMin = jArr2[iA];
            }
            jMin2 = j2;
            i = 0;
            while (true) {
                lv5VarArr = this.q;
                if (i < lv5VarArr.length) {
                    break;
                }
                if (i != this.s) {
                    ov5Var = lv5VarArr[i].b;
                    iZzd = zzel.zzd(ov5Var.f, j3, z2, z);
                    while (true) {
                        if (iZzd >= 0) {
                            iZzd = -1;
                            break;
                        }
                        if ((ov5Var.g[iZzd] & z2) != 0) {
                            break;
                        }
                        iZzd--;
                    }
                    if (iZzd == -1) {
                        iZzd = ov5Var.a(j3);
                    }
                    if (iZzd != -1) {
                        jMin2 = Math.min(ov5Var.c[iZzd], jMin2);
                    }
                    if (j4 != -9223372036854775807L) {
                        iZzd2 = zzel.zzd(ov5Var.f, j4, true, false);
                        while (true) {
                            if (iZzd2 >= 0) {
                                iZzd2 = -1;
                                break;
                            }
                            if ((ov5Var.g[iZzd2] & 1) != 0) {
                                break;
                            }
                            iZzd2--;
                        }
                        if (iZzd2 == -1) {
                            iZzd2 = ov5Var.a(j4);
                        }
                        if (iZzd2 == -1) {
                            jMin = Math.min(ov5Var.c[iZzd2], jMin);
                        }
                    }
                }
                i++;
                z = false;
                z2 = 1;
            }
            zzaajVar = new zzaaj(j3, jMin2);
            if (j4 == -9223372036854775807L) {
                zzaagVar = new zzaag(zzaajVar, zzaajVar);
            } else {
                zzaagVar = new zzaag(zzaajVar, new zzaaj(j4, jMin));
            }
            return zzaagVar;
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        jMin = -1;
        jMin2 = j2;
        i = 0;
        while (true) {
            lv5VarArr = this.q;
            if (i < lv5VarArr.length) {
                break;
                break;
            }
            if (i != this.s) {
                ov5Var = lv5VarArr[i].b;
                iZzd = zzel.zzd(ov5Var.f, j3, z2, z);
                while (true) {
                    if (iZzd >= 0) {
                        iZzd = -1;
                        break;
                    }
                    if ((ov5Var.g[iZzd] & z2) != 0) {
                        break;
                        break;
                    }
                    iZzd--;
                }
                if (iZzd == -1) {
                    iZzd = ov5Var.a(j3);
                }
                if (iZzd != -1) {
                    jMin2 = Math.min(ov5Var.c[iZzd], jMin2);
                }
                if (j4 != -9223372036854775807L) {
                    iZzd2 = zzel.zzd(ov5Var.f, j4, true, false);
                    while (true) {
                        if (iZzd2 >= 0) {
                            iZzd2 = -1;
                            break;
                        }
                        if ((ov5Var.g[iZzd2] & 1) != 0) {
                            break;
                            break;
                        }
                        iZzd2--;
                    }
                    if (iZzd2 == -1) {
                        iZzd2 = ov5Var.a(j4);
                    }
                    if (iZzd2 == -1) {
                        jMin = Math.min(ov5Var.c[iZzd2], jMin);
                    }
                }
            }
            i++;
            z = false;
            z2 = 1;
        }
        zzaajVar = new zzaaj(j3, jMin2);
        if (j4 == -9223372036854775807L) {
            zzaagVar = new zzaag(zzaajVar, zzaajVar);
        } else {
            zzaagVar = new zzaag(zzaajVar, new zzaaj(j4, jMin));
        }
        return zzaagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }

    public zzafn(int i) {
        this.g = 0;
        new mv5();
        this.f = new ArrayList();
        this.d = new zzed(16);
        this.e = new ArrayDeque();
        this.a = new zzed(zzaac.zza);
        this.b = new zzed(4);
        this.c = new zzed();
        this.l = -1;
        this.p = zzzi.zza;
        this.q = new lv5[0];
    }
}
