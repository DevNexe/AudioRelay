package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.util.Log;
import defpackage.a42;
import defpackage.fv5;
import defpackage.g16;
import defpackage.h16;
import defpackage.i16;
import defpackage.j16;
import defpackage.k16;
import defpackage.l16;
import defpackage.mw5;
import defpackage.r16;
import defpackage.s16;
import defpackage.t16;
import defpackage.v16;
import defpackage.vu5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawi implements zzauv, zzavc {
    public int e;
    public int f;
    public long g;
    public int h;
    public zzbag i;
    public int j;
    public int k;
    public zzauw l;
    public s16[] m;
    public long n;
    public boolean o;
    public static final zzaux zza = new mw5(2);
    public static final int p = zzban.zzg("qt  ");
    public final zzbag c = new zzbag(16);
    public final Stack d = new Stack();
    public final zzbag a = new zzbag(zzbae.zza);
    public final zzbag b = new zzbag(4);

    /* JADX WARN: Code duplicated, block: B:163:0x02e6 A[Catch: all -> 0x031a, TRY_LEAVE, TryCatch #0 {all -> 0x031a, blocks: (B:29:0x00b6, B:31:0x00ba, B:33:0x00c0, B:35:0x00c7, B:38:0x00cf, B:39:0x00d7, B:40:0x00de, B:42:0x00e2, B:43:0x00ea, B:45:0x00ee, B:46:0x00f6, B:48:0x00fa, B:50:0x0105, B:52:0x0109, B:53:0x0111, B:55:0x0116, B:57:0x0122, B:65:0x013c, B:66:0x014d, B:67:0x0160, B:68:0x0167, B:70:0x016c, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0184, B:77:0x018c, B:79:0x0190, B:80:0x0198, B:82:0x019c, B:83:0x01a4, B:85:0x01a8, B:86:0x01b0, B:88:0x01b4, B:89:0x01bd, B:91:0x01c1, B:92:0x01cb, B:94:0x01cf, B:95:0x01d7, B:97:0x01db, B:98:0x01e3, B:101:0x01ec, B:103:0x01f2, B:105:0x0207, B:106:0x020e, B:108:0x0212, B:109:0x0219, B:115:0x0223, B:117:0x022a, B:119:0x0232, B:124:0x023e, B:163:0x02e6, B:125:0x0254, B:127:0x025a, B:129:0x0266, B:130:0x0278, B:132:0x0288, B:134:0x028c, B:137:0x0292, B:139:0x0296, B:142:0x029b, B:144:0x029f, B:145:0x02a6, B:147:0x02aa, B:148:0x02b1, B:150:0x02b5, B:151:0x02bc, B:153:0x02c0, B:154:0x02c7, B:156:0x02cb, B:157:0x02d2, B:159:0x02d6, B:160:0x02db, B:162:0x02df, B:165:0x02fe, B:166:0x0305), top: B:434:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x047f  */
    /* JADX WARN: Code duplicated, block: B:248:0x053c  */
    /* JADX WARN: Code duplicated, block: B:249:0x053f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0574 A[ADDED_TO_REGION, LOOP:12: B:252:0x0574->B:253:0x0576, LOOP_START, PHI: r14 r15 r32 r34
  0x0574: PHI (r14v11 int) = (r14v8 int), (r14v16 int) binds: [B:251:0x0572, B:253:0x0576] A[DONT_GENERATE, DONT_INLINE]
  0x0574: PHI (r15v7 int) = (r15v5 int), (r15v13 int) binds: [B:251:0x0572, B:253:0x0576] A[DONT_GENERATE, DONT_INLINE]
  0x0574: PHI (r32v6 int) = (r32v2 int), (r32v9 int) binds: [B:251:0x0572, B:253:0x0576] A[DONT_GENERATE, DONT_INLINE]
  0x0574: PHI (r34v2 long) = (r34v1 long), (r34v4 long) binds: [B:251:0x0572, B:253:0x0576] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:253:0x0576 A[LOOP:12: B:252:0x0574->B:253:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0594 A[ADDED_TO_REGION, LOOP:13: B:256:0x0594->B:258:0x0598, LOOP_START, PHI: r18 r31 r33
  0x0594: PHI (r18v15 int) = (r18v11 int), (r18v16 int) binds: [B:255:0x0592, B:258:0x0598] A[DONT_GENERATE, DONT_INLINE]
  0x0594: PHI (r31v4 int) = (r31v2 int), (r31v8 int) binds: [B:255:0x0592, B:258:0x0598] A[DONT_GENERATE, DONT_INLINE]
  0x0594: PHI (r33v8 int) = (r33v1 int), (r33v9 int) binds: [B:255:0x0592, B:258:0x0598] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x0596 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0598 A[LOOP:13: B:256:0x0594->B:258:0x0598, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:267:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:268:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:271:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:273:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:276:0x05dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x05de  */
    /* JADX WARN: Code duplicated, block: B:278:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:282:0x0616  */
    /* JADX WARN: Code duplicated, block: B:283:0x0618  */
    /* JADX WARN: Code duplicated, block: B:286:0x061e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0624  */
    /* JADX WARN: Code duplicated, block: B:289:0x0626  */
    /* JADX WARN: Code duplicated, block: B:292:0x0632 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0634  */
    /* JADX WARN: Code duplicated, block: B:294:0x0636 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x0638  */
    /* JADX WARN: Code duplicated, block: B:296:0x063b  */
    /* JADX WARN: Code duplicated, block: B:298:0x0640  */
    /* JADX WARN: Code duplicated, block: B:300:0x0648  */
    /* JADX WARN: Code duplicated, block: B:305:0x0680  */
    /* JADX WARN: Code duplicated, block: B:333:0x071a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0722  */
    /* JADX WARN: Code duplicated, block: B:337:0x0729  */
    /* JADX WARN: Code duplicated, block: B:340:0x072d A[LOOP:6: B:338:0x072a->B:340:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x075f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0761  */
    /* JADX WARN: Code duplicated, block: B:350:0x076d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0779  */
    /* JADX WARN: Code duplicated, block: B:354:0x0797  */
    /* JADX WARN: Code duplicated, block: B:355:0x0799  */
    /* JADX WARN: Code duplicated, block: B:360:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:361:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:364:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:365:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:367:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:368:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:371:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:373:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:374:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:378:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:380:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:382:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:383:0x0812  */
    /* JADX WARN: Code duplicated, block: B:386:0x0820  */
    /* JADX WARN: Code duplicated, block: B:388:0x0847  */
    /* JADX WARN: Code duplicated, block: B:393:0x085f  */
    /* JADX WARN: Code duplicated, block: B:398:0x088c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:399:0x088e A[LOOP:10: B:396:0x0889->B:399:0x088e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:404:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:439:0x08a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x07a5 A[EDGE_INSN: B:452:0x07a5->B:358:0x07a5 BREAK  A[LOOP:7: B:348:0x0766->B:357:0x079e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x079e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0881 A[EDGE_INSN: B:455:0x0881->B:395:0x0881 BREAK  A[LOOP:8: B:376:0x07ce->B:394:0x086b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x084d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0895 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0897 A[EDGE_INSN: B:463:0x0897->B:401:0x0897 BREAK  A[LOOP:10: B:396:0x0889->B:399:0x088e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:163:0x02e6, please report this as an issue */
    public final void a(long j) throws zzasv {
        zzawi zzawiVar;
        zzaxd zzaxdVar;
        Stack stack;
        g16 g16Var;
        ArrayList arrayList;
        zzauz zzauzVar;
        long j2;
        long j3;
        zzaxd zzaxdVar2;
        zzauz zzauzVar2;
        int i;
        long jMax;
        zzawi zzawiVar2;
        zzawk zzawkVarA;
        j16 fv5Var;
        boolean z;
        int iZzi;
        int iZzi2;
        int iZzi3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iZze;
        zzawk zzawkVar;
        int iZzi4;
        long j4;
        long j5;
        int i2;
        int iZzi5;
        int i3;
        int i4;
        int iZzi6;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] jArr3;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int[] iArr3;
        int[] iArr4;
        boolean z3;
        int i12;
        int iZzb;
        int i13;
        int i14;
        int iZzi7;
        long[] jArr4;
        v16 v16Var;
        zzauz zzauzVar3;
        long[] jArr5;
        boolean z4;
        int i15;
        int i16;
        int i17;
        boolean z5;
        long[] jArr6;
        long j6;
        int[] iArr5;
        int[] iArr6;
        boolean z6;
        boolean z7;
        long[] jArr7;
        int[] iArr7;
        int[] iArr8;
        long[] jArr8;
        int i18;
        int i19;
        int i20;
        long[] jArr9;
        int i21;
        int i22;
        long[] jArr10;
        long[] jArr11;
        long j7;
        long j8;
        long[] jArr12;
        int[] iArr9;
        int[] iArr10;
        long[] jArr13;
        int iZzb2;
        int iZzb3;
        long[] jArr14;
        long j9;
        int iZzb4;
        boolean z8;
        char c;
        int i23;
        v16 v16Var2;
        int length;
        Parcelable zzaxhVar;
        Parcelable parcelableB;
        String str;
        String str2;
        Parcelable parcelable;
        zzawi zzawiVar3 = this;
        zzawi zzawiVar4 = zzawiVar3;
        while (true) {
            Stack stack2 = zzawiVar3.d;
            if (stack2.isEmpty() || ((g16) stack2.peek()).P0 != j) {
                break;
            }
            g16 g16Var2 = (g16) stack2.pop();
            if (g16Var2.a == i16.C) {
                ArrayList arrayList2 = new ArrayList();
                zzauz zzauzVar4 = new zzauz();
                h16 h16VarC = g16Var2.c(i16.A0);
                int i24 = 12;
                if (h16VarC != null) {
                    boolean z9 = zzawiVar3.o;
                    int i25 = l16.a;
                    if (z9) {
                        zzaxdVar = null;
                        zzawiVar = zzawiVar4;
                    } else {
                        zzbag zzbagVar = h16VarC.P0;
                        int i26 = 8;
                        zzbagVar.zzv(8);
                        while (true) {
                            if (zzbagVar.zza() >= i26) {
                                int iZzc = zzbagVar.zzc();
                                int iZze2 = zzbagVar.zze();
                                if (zzbagVar.zze() == i16.B0) {
                                    zzbagVar.zzv(iZzc);
                                    int i27 = iZzc + iZze2;
                                    zzbagVar.zzw(i24);
                                    while (true) {
                                        if (zzbagVar.zzc() < i27) {
                                            int iZzc2 = zzbagVar.zzc();
                                            int iZze3 = zzbagVar.zze();
                                            if (zzbagVar.zze() == i16.C0) {
                                                zzbagVar.zzv(iZzc2);
                                                int i28 = iZzc2 + iZze3;
                                                zzbagVar.zzw(i26);
                                                ArrayList arrayList3 = new ArrayList();
                                                while (zzbagVar.zzc() < i28) {
                                                    int i29 = r16.a;
                                                    int iZze4 = zzbagVar.zze() + zzbagVar.zzc();
                                                    int iZze5 = zzbagVar.zze();
                                                    int i30 = i28;
                                                    zzawi zzawiVar5 = zzawiVar4;
                                                    if (((iZze5 >> 24) & 255) != 169) {
                                                        try {
                                                            if (iZze5 == r16.m) {
                                                                int iA = r16.a(zzbagVar);
                                                                if (iA > 0) {
                                                                    String[] strArr = r16.D;
                                                                    int length2 = strArr.length;
                                                                    if (iA <= 148) {
                                                                        str2 = strArr[iA - 1];
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (str2 != null) {
                                                                    zzaxhVar = new zzaxl("TCON", null, str2);
                                                                } else {
                                                                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                    zzaxhVar = null;
                                                                }
                                                            } else if (iZze5 == r16.o) {
                                                                zzaxhVar = r16.c(iZze5, "TPOS", zzbagVar);
                                                            } else if (iZze5 == r16.p) {
                                                                zzaxhVar = r16.c(iZze5, "TRCK", zzbagVar);
                                                            } else {
                                                                if (iZze5 == r16.q) {
                                                                    parcelableB = r16.b(iZze5, "TBPM", zzbagVar, true, false);
                                                                } else if (iZze5 == r16.r) {
                                                                    parcelableB = r16.b(iZze5, "TCMP", zzbagVar, true, true);
                                                                } else {
                                                                    int i31 = 4;
                                                                    if (iZze5 == r16.l) {
                                                                        int iZze6 = zzbagVar.zze();
                                                                        if (zzbagVar.zze() == i16.F0) {
                                                                            int iZze7 = zzbagVar.zze() & 16777215;
                                                                            if (iZze7 == 13) {
                                                                                str = "image/jpeg";
                                                                            } else if (iZze7 == 14) {
                                                                                str = "image/png";
                                                                                iZze7 = 14;
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            if (str == null) {
                                                                                Log.w("MetadataUtil", "Unrecognized cover art flags: " + iZze7);
                                                                            } else {
                                                                                zzbagVar.zzw(4);
                                                                                int i32 = iZze6 - 16;
                                                                                byte[] bArr = new byte[i32];
                                                                                zzbagVar.zzq(bArr, 0, i32);
                                                                                parcelableB = new zzaxf(str, null, 3, bArr);
                                                                            }
                                                                        } else {
                                                                            Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                                        }
                                                                        zzaxhVar = null;
                                                                    } else {
                                                                        String strZzo = null;
                                                                        if (iZze5 == r16.s) {
                                                                            zzaxhVar = r16.d(iZze5, "TPE2", zzbagVar);
                                                                        } else if (iZze5 == r16.t) {
                                                                            zzaxhVar = r16.d(iZze5, "TSOT", zzbagVar);
                                                                        } else if (iZze5 == r16.u) {
                                                                            zzaxhVar = r16.d(iZze5, "TSO2", zzbagVar);
                                                                        } else if (iZze5 == r16.v) {
                                                                            zzaxhVar = r16.d(iZze5, "TSOA", zzbagVar);
                                                                        } else if (iZze5 == r16.w) {
                                                                            zzaxhVar = r16.d(iZze5, "TSOP", zzbagVar);
                                                                        } else if (iZze5 == r16.x) {
                                                                            zzaxhVar = r16.d(iZze5, "TSOC", zzbagVar);
                                                                        } else if (iZze5 == r16.y) {
                                                                            parcelableB = r16.b(iZze5, "ITUNESADVISORY", zzbagVar, false, false);
                                                                        } else if (iZze5 == r16.z) {
                                                                            parcelableB = r16.b(iZze5, "ITUNESGAPLESS", zzbagVar, false, true);
                                                                        } else if (iZze5 == r16.A) {
                                                                            zzaxhVar = r16.d(iZze5, "TVSHOWSORT", zzbagVar);
                                                                        } else if (iZze5 == r16.B) {
                                                                            zzaxhVar = r16.d(iZze5, "TVSHOW", zzbagVar);
                                                                        } else if (iZze5 == r16.C) {
                                                                            String strZzo2 = null;
                                                                            int i33 = -1;
                                                                            int i34 = -1;
                                                                            while (zzbagVar.zzc() < iZze4) {
                                                                                int iZzc3 = zzbagVar.zzc();
                                                                                int iZze8 = zzbagVar.zze();
                                                                                int iZze9 = zzbagVar.zze();
                                                                                zzbagVar.zzw(i31);
                                                                                if (iZze9 == i16.D0) {
                                                                                    strZzo = zzbagVar.zzo(iZze8 - 12);
                                                                                } else if (iZze9 == i16.E0) {
                                                                                    strZzo2 = zzbagVar.zzo(iZze8 - 12);
                                                                                } else {
                                                                                    int i35 = i16.F0;
                                                                                    if (iZze9 == i35) {
                                                                                        i34 = iZze8;
                                                                                    }
                                                                                    if (iZze9 == i35) {
                                                                                        i33 = iZzc3;
                                                                                    }
                                                                                    zzbagVar.zzw(iZze8 - 12);
                                                                                }
                                                                                i31 = 4;
                                                                            }
                                                                            if ("com.apple.iTunes".equals(strZzo) && "iTunSMPB".equals(strZzo2) && i33 != -1) {
                                                                                zzbagVar.zzv(i33);
                                                                                zzbagVar.zzw(16);
                                                                                zzaxhVar = new zzaxh("und", strZzo2, zzbagVar.zzo(i34 - 16));
                                                                            } else {
                                                                                zzaxhVar = null;
                                                                            }
                                                                        } else {
                                                                            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + i16.a(iZze5));
                                                                            zzbagVar.zzv(iZze4);
                                                                            parcelable = null;
                                                                        }
                                                                    }
                                                                }
                                                                zzaxhVar = parcelableB;
                                                            }
                                                            zzbagVar.zzv(iZze4);
                                                            parcelable = zzaxhVar;
                                                        } catch (Throwable th) {
                                                            zzbagVar.zzv(iZze4);
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i36 = iZze5 & 16777215;
                                                        if (i36 == r16.c) {
                                                            int iZze10 = zzbagVar.zze();
                                                            if (zzbagVar.zze() == i16.F0) {
                                                                zzbagVar.zzw(8);
                                                                String strZzo3 = zzbagVar.zzo(iZze10 - 16);
                                                                zzaxhVar = new zzaxh("und", strZzo3, strZzo3);
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(i16.a(iZze5)));
                                                                zzaxhVar = null;
                                                            }
                                                        } else if (i36 == r16.a || i36 == r16.b) {
                                                            zzaxhVar = r16.d(iZze5, "TIT2", zzbagVar);
                                                        } else if (i36 == r16.h || i36 == r16.i) {
                                                            zzaxhVar = r16.d(iZze5, "TCOM", zzbagVar);
                                                        } else if (i36 == r16.d) {
                                                            zzaxhVar = r16.d(iZze5, "TDRC", zzbagVar);
                                                        } else if (i36 == r16.e) {
                                                            zzaxhVar = r16.d(iZze5, "TPE1", zzbagVar);
                                                        } else if (i36 == r16.f) {
                                                            zzaxhVar = r16.d(iZze5, "TSSE", zzbagVar);
                                                        } else if (i36 == r16.g) {
                                                            zzaxhVar = r16.d(iZze5, "TALB", zzbagVar);
                                                        } else if (i36 == r16.j) {
                                                            zzaxhVar = r16.d(iZze5, "USLT", zzbagVar);
                                                        } else if (i36 == r16.k) {
                                                            zzaxhVar = r16.d(iZze5, "TCON", zzbagVar);
                                                        } else if (i36 == r16.n) {
                                                            zzaxhVar = r16.d(iZze5, "TIT1", zzbagVar);
                                                        } else {
                                                            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + i16.a(iZze5));
                                                            zzbagVar.zzv(iZze4);
                                                            parcelable = null;
                                                        }
                                                        zzbagVar.zzv(iZze4);
                                                        parcelable = zzaxhVar;
                                                    }
                                                    if (parcelable != null) {
                                                        arrayList3.add(parcelable);
                                                    }
                                                    i28 = i30;
                                                    zzawiVar4 = zzawiVar5;
                                                }
                                                zzawiVar = zzawiVar4;
                                                zzaxdVar = arrayList3.isEmpty() ? null : new zzaxd(arrayList3);
                                            } else {
                                                zzbagVar.zzw(iZze3 - 8);
                                                i26 = 8;
                                            }
                                        }
                                    }
                                } else {
                                    zzbagVar.zzw(iZze2 - 8);
                                    i24 = 12;
                                    i26 = 8;
                                }
                            }
                            zzawiVar = zzawiVar4;
                        }
                    }
                    if (zzaxdVar != null) {
                        zzauzVar4.zzb(zzaxdVar);
                    }
                } else {
                    zzawiVar = zzawiVar4;
                    zzaxdVar = null;
                }
                long j10 = -9223372036854775807L;
                long j11 = Long.MAX_VALUE;
                int i37 = 0;
                while (true) {
                    ArrayList arrayList4 = g16Var2.R0;
                    if (i37 >= arrayList4.size()) {
                        zzawiVar3.n = j10;
                        zzawiVar3.m = (s16[]) arrayList2.toArray(new s16[arrayList2.size()]);
                        zzawiVar3.l.zzb();
                        zzawiVar3.l.zzc(zzawiVar3);
                        stack2.clear();
                        zzawiVar3.e = 2;
                        break;
                    }
                    g16 g16Var3 = (g16) arrayList4.get(i37);
                    if (g16Var3.a == i16.E && (zzawkVarA = l16.a(g16Var3, g16Var2.c(i16.D), -9223372036854775807L, null, zzawiVar3.o)) != null) {
                        g16 g16VarB = g16Var3.b(i16.F).b(i16.G).b(i16.H);
                        h16 h16VarC2 = g16VarB.c(i16.q0);
                        if (h16VarC2 != null) {
                            fv5Var = new k16(h16VarC2);
                        } else {
                            h16 h16VarC3 = g16VarB.c(i16.r0);
                            if (h16VarC3 == null) {
                                throw new zzasv("Track has no sample table size information");
                            }
                            fv5Var = new fv5(h16VarC3);
                        }
                        int iZza = fv5Var.zza();
                        if (iZza == 0) {
                            v16Var = new v16(new long[0], new int[0], 0, new long[0], new int[0]);
                            i37 = i37;
                            stack = stack2;
                            g16Var = g16Var2;
                            arrayList = arrayList2;
                            zzauzVar = zzauzVar4;
                            zzaxdVar = zzaxdVar;
                            j2 = j10;
                            j3 = j11;
                            zzawkVar = zzawkVarA;
                        } else {
                            h16 h16VarC4 = g16VarB.c(i16.s0);
                            if (h16VarC4 == null) {
                                h16VarC4 = g16VarB.c(i16.t0);
                                z = true;
                            } else {
                                z = false;
                            }
                            zzbag zzbagVar2 = h16VarC4.P0;
                            g16Var = g16Var2;
                            zzbag zzbagVar3 = g16VarB.c(i16.p0).P0;
                            stack = stack2;
                            zzbag zzbagVar4 = g16VarB.c(i16.m0).P0;
                            j3 = j11;
                            h16 h16VarC5 = g16VarB.c(i16.n0);
                            zzbag zzbagVar5 = h16VarC5 != null ? h16VarC5.P0 : null;
                            h16 h16VarC6 = g16VarB.c(i16.o0);
                            zzbag zzbagVar6 = h16VarC6 != null ? h16VarC6.P0 : null;
                            vu5 vu5Var = new vu5(zzbagVar3, zzbagVar2, z);
                            zzbagVar4.zzv(12);
                            int iZzi8 = zzbagVar4.zzi() - 1;
                            int iZzi9 = zzbagVar4.zzi();
                            int iZzi10 = zzbagVar4.zzi();
                            if (zzbagVar6 != null) {
                                zzbagVar6.zzv(12);
                                iZzi = zzbagVar6.zzi();
                            } else {
                                iZzi = 0;
                            }
                            if (zzbagVar5 != null) {
                                zzbagVar5.zzv(12);
                                iZzi2 = zzbagVar5.zzi();
                                if (iZzi2 > 0) {
                                    iZzi3 = zzbagVar5.zzi() - 1;
                                } else {
                                    zzbagVar5 = null;
                                }
                                long j12 = 0;
                                if (fv5Var.mo33zzc()) {
                                    arrayList = arrayList2;
                                    j2 = j10;
                                    if (!"audio/raw".equals(zzawkVarA.zzf.zzf) && iZzi8 == 0) {
                                        if (iZzi == 0 && iZzi2 == 0) {
                                            int i38 = vu5Var.b;
                                            long[] jArr15 = new long[i38];
                                            int[] iArr11 = new int[i38];
                                            while (vu5Var.a()) {
                                                int i39 = vu5Var.c;
                                                jArr15[i39] = vu5Var.e;
                                                iArr11[i39] = vu5Var.d;
                                            }
                                            int iZzb5 = fv5Var.zzb();
                                            long j13 = iZzi10;
                                            int i40 = 8192 / iZzb5;
                                            int iZzd = 0;
                                            for (int i41 = 0; i41 < i38; i41++) {
                                                iZzd += zzban.zzd(iArr11[i41], i40);
                                            }
                                            long[] jArr16 = new long[iZzd];
                                            iArr3 = new int[iZzd];
                                            long[] jArr17 = new long[iZzd];
                                            iArr4 = new int[iZzd];
                                            int i42 = 0;
                                            int i43 = 0;
                                            int i44 = 0;
                                            zzaxdVar = zzaxdVar;
                                            int i45 = 0;
                                            while (i45 < i38) {
                                                int i46 = iArr11[i45];
                                                long j14 = jArr15[i45];
                                                int i47 = i38;
                                                int i48 = i46;
                                                long[] jArr18 = jArr15;
                                                int iMax = i42;
                                                int i49 = i43;
                                                int[] iArr12 = iArr11;
                                                int i50 = i49;
                                                while (i48 > 0) {
                                                    int iMin = Math.min(i40, i48);
                                                    jArr16[i44] = j14;
                                                    int i51 = i40;
                                                    int i52 = iZzb5 * iMin;
                                                    iArr3[i44] = i52;
                                                    iMax = Math.max(iMax, i52);
                                                    jArr17[i44] = ((long) i50) * j13;
                                                    iArr4[i44] = 1;
                                                    j14 += (long) iArr3[i44];
                                                    i50 += iMin;
                                                    i48 -= iMin;
                                                    i44++;
                                                    i40 = i51;
                                                    jArr16 = jArr16;
                                                }
                                                i45++;
                                                i42 = iMax;
                                                jArr15 = jArr18;
                                                i38 = i47;
                                                i43 = i50;
                                                iArr11 = iArr12;
                                            }
                                            zzawkVar = zzawkVarA;
                                            jArr2 = jArr17;
                                            i11 = i42;
                                            j5 = 0;
                                            jArr3 = jArr16;
                                        } else {
                                            iZzi8 = 0;
                                        }
                                        jArr4 = zzawkVar.zzi;
                                        if (jArr4 != null || zzauzVar4.zza()) {
                                            zzauzVar = zzauzVar4;
                                            zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                            v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                        } else if (jArr4.length == 1 && zzawkVar.zzb == 1 && (length = jArr2.length) >= 2) {
                                            long j15 = zzawkVar.zzj[0];
                                            long jZzj = zzban.zzj(jArr4[0], zzawkVar.zzc, zzawkVar.zzd) + j15;
                                            long j16 = jArr2[0];
                                            if (j16 > j15 || j15 >= jArr2[1] || jArr2[length - 1] >= jZzj || jZzj > j5) {
                                                zzauzVar3 = zzauzVar4;
                                                jArr5 = zzawkVar.zzi;
                                                if (jArr5.length == 1) {
                                                    c = 0;
                                                    if (jArr5[0] == 0) {
                                                        i23 = 0;
                                                        while (i23 < jArr2.length) {
                                                            jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                            i23++;
                                                            c = 0;
                                                        }
                                                        v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                        v16Var = v16Var2;
                                                        zzauzVar = zzauzVar3;
                                                    }
                                                }
                                                if (zzawkVar.zzb == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                i15 = 0;
                                                i16 = 0;
                                                i17 = 0;
                                                z5 = false;
                                                while (true) {
                                                    jArr6 = zzawkVar.zzi;
                                                    j6 = -1;
                                                    if (i15 < jArr6.length) {
                                                        break;
                                                        break;
                                                    }
                                                    int[] iArr13 = iArr4;
                                                    int[] iArr14 = iArr3;
                                                    j9 = zzawkVar.zzj[i15];
                                                    if (j9 != -1) {
                                                        long jZzj2 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                        iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                        int iZzb6 = zzban.zzb(jArr2, j9 + jZzj2, z4, false);
                                                        int i53 = (iZzb6 - iZzb4) + i16;
                                                        if (i17 != iZzb4) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        z5 = z8 | z5;
                                                        i17 = iZzb6;
                                                        i16 = i53;
                                                    }
                                                    i15++;
                                                    iArr3 = iArr14;
                                                    iArr4 = iArr13;
                                                }
                                                iArr5 = iArr4;
                                                iArr6 = iArr3;
                                                if (i16 != iZza) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                z7 = z6 | z5;
                                                if (z7) {
                                                    jArr7 = new long[i16];
                                                } else {
                                                    jArr7 = jArr3;
                                                }
                                                if (z7) {
                                                    iArr7 = new int[i16];
                                                } else {
                                                    iArr7 = iArr6;
                                                }
                                                if (true == z7) {
                                                    i11 = 0;
                                                }
                                                if (z7) {
                                                    iArr8 = new int[i16];
                                                } else {
                                                    iArr8 = iArr5;
                                                }
                                                jArr8 = new long[i16];
                                                i18 = 0;
                                                i19 = 0;
                                                i20 = i11;
                                                while (true) {
                                                    jArr9 = zzawkVar.zzi;
                                                    if (i18 < jArr9.length) {
                                                        break;
                                                        break;
                                                    }
                                                    jArr10 = jArr8;
                                                    jArr11 = jArr7;
                                                    j7 = zzawkVar.zzj[i18];
                                                    j8 = jArr9[i18];
                                                    if (j7 != j6) {
                                                        long jZzj3 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                        iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                        iZzb3 = zzban.zzb(jArr2, jZzj3 + j7, z4, false);
                                                        if (z7) {
                                                            int i54 = iZzb3 - iZzb2;
                                                            jArr14 = jArr11;
                                                            System.arraycopy(jArr3, iZzb2, jArr14, i19, i54);
                                                            iArr9 = iArr6;
                                                            System.arraycopy(iArr9, iZzb2, iArr7, i19, i54);
                                                            iArr10 = iArr5;
                                                            System.arraycopy(iArr10, iZzb2, iArr8, i19, i54);
                                                        } else {
                                                            jArr14 = jArr11;
                                                            iArr9 = iArr6;
                                                            iArr10 = iArr5;
                                                        }
                                                        int i55 = i20;
                                                        while (iZzb2 < iZzb3) {
                                                            long[] jArr19 = jArr14;
                                                            long[] jArr20 = jArr3;
                                                            long j17 = j7;
                                                            jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                            if (!z7) {
                                                            }
                                                            i19++;
                                                            iZzb2++;
                                                            jArr3 = jArr20;
                                                            j7 = j17;
                                                            jArr14 = jArr19;
                                                        }
                                                        jArr12 = jArr14;
                                                        jArr13 = jArr3;
                                                        i20 = i55;
                                                    } else {
                                                        jArr12 = jArr11;
                                                        z4 = z4;
                                                        iArr9 = iArr6;
                                                        zzauzVar3 = zzauzVar3;
                                                        iArr10 = iArr5;
                                                        jArr13 = jArr3;
                                                    }
                                                    j12 += j8;
                                                    i18++;
                                                    jArr3 = jArr13;
                                                    jArr7 = jArr12;
                                                    jArr8 = jArr10;
                                                    j6 = -1;
                                                    iArr5 = iArr10;
                                                    zzauzVar3 = zzauzVar3;
                                                    iArr6 = iArr9;
                                                    z4 = z4;
                                                }
                                                zzauzVar = zzauzVar3;
                                                long[] jArr21 = jArr8;
                                                long[] jArr22 = jArr7;
                                                i21 = 0;
                                                i22 = 0;
                                                while (true) {
                                                    if (i21 < iArr8.length) {
                                                        if (i22 == 0) {
                                                            throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                        }
                                                        break;
                                                    } else if (i22 == 0) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i22 = iArr8[i21] & 1;
                                                        i21++;
                                                    }
                                                }
                                                v16Var = new v16(jArr22, iArr7, i20, jArr21, iArr8);
                                            } else {
                                                long jZzj4 = zzban.zzj(j15 - j16, zzawkVar.zzf.zzs, zzawkVar.zzc);
                                                long jZzj5 = zzban.zzj(j5 - jZzj, zzawkVar.zzf.zzs, zzawkVar.zzc);
                                                if (jZzj4 != 0) {
                                                    if (jZzj4 <= 2147483647L || jZzj5 > 2147483647L) {
                                                        zzauzVar3 = zzauzVar4;
                                                        jArr5 = zzawkVar.zzi;
                                                        if (jArr5.length == 1) {
                                                            c = 0;
                                                            if (jArr5[0] == 0) {
                                                                i23 = 0;
                                                                while (i23 < jArr2.length) {
                                                                    jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                                    i23++;
                                                                    c = 0;
                                                                }
                                                                v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                            }
                                                        }
                                                        if (zzawkVar.zzb == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        i15 = 0;
                                                        i16 = 0;
                                                        i17 = 0;
                                                        z5 = false;
                                                        while (true) {
                                                            jArr6 = zzawkVar.zzi;
                                                            j6 = -1;
                                                            if (i15 < jArr6.length) {
                                                                break;
                                                                break;
                                                            }
                                                            int[] iArr15 = iArr4;
                                                            int[] iArr16 = iArr3;
                                                            j9 = zzawkVar.zzj[i15];
                                                            if (j9 != -1) {
                                                                long jZzj6 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                                int iZzb7 = zzban.zzb(jArr2, j9 + jZzj6, z4, false);
                                                                int i56 = (iZzb7 - iZzb4) + i16;
                                                                if (i17 != iZzb4) {
                                                                    z8 = true;
                                                                } else {
                                                                    z8 = false;
                                                                }
                                                                z5 = z8 | z5;
                                                                i17 = iZzb7;
                                                                i16 = i56;
                                                            }
                                                            i15++;
                                                            iArr3 = iArr16;
                                                            iArr4 = iArr15;
                                                        }
                                                        iArr5 = iArr4;
                                                        iArr6 = iArr3;
                                                        if (i16 != iZza) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        z7 = z6 | z5;
                                                        if (z7) {
                                                            jArr7 = new long[i16];
                                                        } else {
                                                            jArr7 = jArr3;
                                                        }
                                                        if (z7) {
                                                            iArr7 = new int[i16];
                                                        } else {
                                                            iArr7 = iArr6;
                                                        }
                                                        if (true == z7) {
                                                            i11 = 0;
                                                        }
                                                        if (z7) {
                                                            iArr8 = new int[i16];
                                                        } else {
                                                            iArr8 = iArr5;
                                                        }
                                                        jArr8 = new long[i16];
                                                        i18 = 0;
                                                        i19 = 0;
                                                        i20 = i11;
                                                        while (true) {
                                                            jArr9 = zzawkVar.zzi;
                                                            if (i18 < jArr9.length) {
                                                                break;
                                                                break;
                                                            }
                                                            jArr10 = jArr8;
                                                            jArr11 = jArr7;
                                                            j7 = zzawkVar.zzj[i18];
                                                            j8 = jArr9[i18];
                                                            if (j7 != j6) {
                                                                long jZzj7 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                                iZzb3 = zzban.zzb(jArr2, jZzj7 + j7, z4, false);
                                                                if (z7) {
                                                                    int i57 = iZzb3 - iZzb2;
                                                                    jArr14 = jArr11;
                                                                    System.arraycopy(jArr3, iZzb2, jArr14, i19, i57);
                                                                    iArr9 = iArr6;
                                                                    System.arraycopy(iArr9, iZzb2, iArr7, i19, i57);
                                                                    iArr10 = iArr5;
                                                                    System.arraycopy(iArr10, iZzb2, iArr8, i19, i57);
                                                                } else {
                                                                    jArr14 = jArr11;
                                                                    iArr9 = iArr6;
                                                                    iArr10 = iArr5;
                                                                }
                                                                int i58 = i20;
                                                                while (iZzb2 < iZzb3) {
                                                                    long[] jArr110 = jArr14;
                                                                    long[] jArr23 = jArr3;
                                                                    long j18 = j7;
                                                                    jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                                    if (!z7) {
                                                                    }
                                                                    i19++;
                                                                    iZzb2++;
                                                                    jArr3 = jArr23;
                                                                    j7 = j18;
                                                                    jArr14 = jArr110;
                                                                }
                                                                jArr12 = jArr14;
                                                                jArr13 = jArr3;
                                                                i20 = i58;
                                                            } else {
                                                                jArr12 = jArr11;
                                                                z4 = z4;
                                                                iArr9 = iArr6;
                                                                zzauzVar3 = zzauzVar3;
                                                                iArr10 = iArr5;
                                                                jArr13 = jArr3;
                                                            }
                                                            j12 += j8;
                                                            i18++;
                                                            jArr3 = jArr13;
                                                            jArr7 = jArr12;
                                                            jArr8 = jArr10;
                                                            j6 = -1;
                                                            iArr5 = iArr10;
                                                            zzauzVar3 = zzauzVar3;
                                                            iArr6 = iArr9;
                                                            z4 = z4;
                                                        }
                                                        zzauzVar = zzauzVar3;
                                                        long[] jArr24 = jArr8;
                                                        long[] jArr25 = jArr7;
                                                        i21 = 0;
                                                        i22 = 0;
                                                        while (true) {
                                                            if (i21 < iArr8.length) {
                                                                if (i22 == 0) {
                                                                    throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                                }
                                                                break;
                                                            } else if (i22 == 0) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i22 = iArr8[i21] & 1;
                                                                i21++;
                                                            }
                                                        }
                                                        v16Var = new v16(jArr25, iArr7, i20, jArr24, iArr8);
                                                    } else {
                                                        int i59 = (int) jZzj4;
                                                        zzauzVar3 = zzauzVar4;
                                                        zzauzVar3.zzb = i59;
                                                        zzauzVar3.zzc = (int) jZzj5;
                                                        zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                                        v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                    }
                                                } else if (jZzj5 != 0) {
                                                    jZzj4 = 0;
                                                    if (jZzj4 <= 2147483647L) {
                                                        zzauzVar3 = zzauzVar4;
                                                        jArr5 = zzawkVar.zzi;
                                                        if (jArr5.length == 1) {
                                                            c = 0;
                                                            if (jArr5[0] == 0) {
                                                                i23 = 0;
                                                                while (i23 < jArr2.length) {
                                                                    jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                                    i23++;
                                                                    c = 0;
                                                                }
                                                                v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                            }
                                                        }
                                                        if (zzawkVar.zzb == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        i15 = 0;
                                                        i16 = 0;
                                                        i17 = 0;
                                                        z5 = false;
                                                        while (true) {
                                                            jArr6 = zzawkVar.zzi;
                                                            j6 = -1;
                                                            if (i15 < jArr6.length) {
                                                                break;
                                                                break;
                                                            }
                                                            int[] iArr17 = iArr4;
                                                            int[] iArr18 = iArr3;
                                                            j9 = zzawkVar.zzj[i15];
                                                            if (j9 != -1) {
                                                                long jZzj8 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                                int iZzb8 = zzban.zzb(jArr2, j9 + jZzj8, z4, false);
                                                                int i510 = (iZzb8 - iZzb4) + i16;
                                                                if (i17 != iZzb4) {
                                                                    z8 = true;
                                                                } else {
                                                                    z8 = false;
                                                                }
                                                                z5 = z8 | z5;
                                                                i17 = iZzb8;
                                                                i16 = i510;
                                                            }
                                                            i15++;
                                                            iArr3 = iArr18;
                                                            iArr4 = iArr17;
                                                        }
                                                        iArr5 = iArr4;
                                                        iArr6 = iArr3;
                                                        if (i16 != iZza) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        z7 = z6 | z5;
                                                        if (z7) {
                                                            jArr7 = new long[i16];
                                                        } else {
                                                            jArr7 = jArr3;
                                                        }
                                                        if (z7) {
                                                            iArr7 = new int[i16];
                                                        } else {
                                                            iArr7 = iArr6;
                                                        }
                                                        if (true == z7) {
                                                            i11 = 0;
                                                        }
                                                        if (z7) {
                                                            iArr8 = new int[i16];
                                                        } else {
                                                            iArr8 = iArr5;
                                                        }
                                                        jArr8 = new long[i16];
                                                        i18 = 0;
                                                        i19 = 0;
                                                        i20 = i11;
                                                        while (true) {
                                                            jArr9 = zzawkVar.zzi;
                                                            if (i18 < jArr9.length) {
                                                                break;
                                                                break;
                                                            }
                                                            jArr10 = jArr8;
                                                            jArr11 = jArr7;
                                                            j7 = zzawkVar.zzj[i18];
                                                            j8 = jArr9[i18];
                                                            if (j7 != j6) {
                                                                long jZzj9 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                                iZzb3 = zzban.zzb(jArr2, jZzj9 + j7, z4, false);
                                                                if (z7) {
                                                                    int i511 = iZzb3 - iZzb2;
                                                                    jArr14 = jArr11;
                                                                    System.arraycopy(jArr3, iZzb2, jArr14, i19, i511);
                                                                    iArr9 = iArr6;
                                                                    System.arraycopy(iArr9, iZzb2, iArr7, i19, i511);
                                                                    iArr10 = iArr5;
                                                                    System.arraycopy(iArr10, iZzb2, iArr8, i19, i511);
                                                                } else {
                                                                    jArr14 = jArr11;
                                                                    iArr9 = iArr6;
                                                                    iArr10 = iArr5;
                                                                }
                                                                int i512 = i20;
                                                                while (iZzb2 < iZzb3) {
                                                                    long[] jArr111 = jArr14;
                                                                    long[] jArr26 = jArr3;
                                                                    long j19 = j7;
                                                                    jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                                    if (!z7) {
                                                                    }
                                                                    i19++;
                                                                    iZzb2++;
                                                                    jArr3 = jArr26;
                                                                    j7 = j19;
                                                                    jArr14 = jArr111;
                                                                }
                                                                jArr12 = jArr14;
                                                                jArr13 = jArr3;
                                                                i20 = i512;
                                                            } else {
                                                                jArr12 = jArr11;
                                                                z4 = z4;
                                                                iArr9 = iArr6;
                                                                zzauzVar3 = zzauzVar3;
                                                                iArr10 = iArr5;
                                                                jArr13 = jArr3;
                                                            }
                                                            j12 += j8;
                                                            i18++;
                                                            jArr3 = jArr13;
                                                            jArr7 = jArr12;
                                                            jArr8 = jArr10;
                                                            j6 = -1;
                                                            iArr5 = iArr10;
                                                            zzauzVar3 = zzauzVar3;
                                                            iArr6 = iArr9;
                                                            z4 = z4;
                                                        }
                                                        zzauzVar = zzauzVar3;
                                                        long[] jArr27 = jArr8;
                                                        long[] jArr28 = jArr7;
                                                        i21 = 0;
                                                        i22 = 0;
                                                        while (true) {
                                                            if (i21 < iArr8.length) {
                                                                if (i22 == 0) {
                                                                    throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                                }
                                                                break;
                                                            } else if (i22 == 0) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i22 = iArr8[i21] & 1;
                                                                i21++;
                                                            }
                                                        }
                                                        v16Var = new v16(jArr28, iArr7, i20, jArr27, iArr8);
                                                    } else {
                                                        zzauzVar3 = zzauzVar4;
                                                        jArr5 = zzawkVar.zzi;
                                                        if (jArr5.length == 1) {
                                                            c = 0;
                                                            if (jArr5[0] == 0) {
                                                                i23 = 0;
                                                                while (i23 < jArr2.length) {
                                                                    jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                                    i23++;
                                                                    c = 0;
                                                                }
                                                                v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                            }
                                                        }
                                                        if (zzawkVar.zzb == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        i15 = 0;
                                                        i16 = 0;
                                                        i17 = 0;
                                                        z5 = false;
                                                        while (true) {
                                                            jArr6 = zzawkVar.zzi;
                                                            j6 = -1;
                                                            if (i15 < jArr6.length) {
                                                                break;
                                                                break;
                                                            }
                                                            int[] iArr19 = iArr4;
                                                            int[] iArr110 = iArr3;
                                                            j9 = zzawkVar.zzj[i15];
                                                            if (j9 != -1) {
                                                                long jZzj10 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                                int iZzb9 = zzban.zzb(jArr2, j9 + jZzj10, z4, false);
                                                                int i513 = (iZzb9 - iZzb4) + i16;
                                                                if (i17 != iZzb4) {
                                                                    z8 = true;
                                                                } else {
                                                                    z8 = false;
                                                                }
                                                                z5 = z8 | z5;
                                                                i17 = iZzb9;
                                                                i16 = i513;
                                                            }
                                                            i15++;
                                                            iArr3 = iArr110;
                                                            iArr4 = iArr19;
                                                        }
                                                        iArr5 = iArr4;
                                                        iArr6 = iArr3;
                                                        if (i16 != iZza) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        z7 = z6 | z5;
                                                        if (z7) {
                                                            jArr7 = new long[i16];
                                                        } else {
                                                            jArr7 = jArr3;
                                                        }
                                                        if (z7) {
                                                            iArr7 = new int[i16];
                                                        } else {
                                                            iArr7 = iArr6;
                                                        }
                                                        if (true == z7) {
                                                            i11 = 0;
                                                        }
                                                        if (z7) {
                                                            iArr8 = new int[i16];
                                                        } else {
                                                            iArr8 = iArr5;
                                                        }
                                                        jArr8 = new long[i16];
                                                        i18 = 0;
                                                        i19 = 0;
                                                        i20 = i11;
                                                        while (true) {
                                                            jArr9 = zzawkVar.zzi;
                                                            if (i18 < jArr9.length) {
                                                                break;
                                                                break;
                                                            }
                                                            jArr10 = jArr8;
                                                            jArr11 = jArr7;
                                                            j7 = zzawkVar.zzj[i18];
                                                            j8 = jArr9[i18];
                                                            if (j7 != j6) {
                                                                long jZzj11 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                                iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                                iZzb3 = zzban.zzb(jArr2, jZzj11 + j7, z4, false);
                                                                if (z7) {
                                                                    int i514 = iZzb3 - iZzb2;
                                                                    jArr14 = jArr11;
                                                                    System.arraycopy(jArr3, iZzb2, jArr14, i19, i514);
                                                                    iArr9 = iArr6;
                                                                    System.arraycopy(iArr9, iZzb2, iArr7, i19, i514);
                                                                    iArr10 = iArr5;
                                                                    System.arraycopy(iArr10, iZzb2, iArr8, i19, i514);
                                                                } else {
                                                                    jArr14 = jArr11;
                                                                    iArr9 = iArr6;
                                                                    iArr10 = iArr5;
                                                                }
                                                                int i515 = i20;
                                                                while (iZzb2 < iZzb3) {
                                                                    long[] jArr112 = jArr14;
                                                                    long[] jArr29 = jArr3;
                                                                    long j110 = j7;
                                                                    jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                                    if (!z7) {
                                                                    }
                                                                    i19++;
                                                                    iZzb2++;
                                                                    jArr3 = jArr29;
                                                                    j7 = j110;
                                                                    jArr14 = jArr112;
                                                                }
                                                                jArr12 = jArr14;
                                                                jArr13 = jArr3;
                                                                i20 = i515;
                                                            } else {
                                                                jArr12 = jArr11;
                                                                z4 = z4;
                                                                iArr9 = iArr6;
                                                                zzauzVar3 = zzauzVar3;
                                                                iArr10 = iArr5;
                                                                jArr13 = jArr3;
                                                            }
                                                            j12 += j8;
                                                            i18++;
                                                            jArr3 = jArr13;
                                                            jArr7 = jArr12;
                                                            jArr8 = jArr10;
                                                            j6 = -1;
                                                            iArr5 = iArr10;
                                                            zzauzVar3 = zzauzVar3;
                                                            iArr6 = iArr9;
                                                            z4 = z4;
                                                        }
                                                        zzauzVar = zzauzVar3;
                                                        long[] jArr210 = jArr8;
                                                        long[] jArr211 = jArr7;
                                                        i21 = 0;
                                                        i22 = 0;
                                                        while (true) {
                                                            if (i21 < iArr8.length) {
                                                                if (i22 == 0) {
                                                                    throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                                }
                                                                break;
                                                            } else if (i22 == 0) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i22 = iArr8[i21] & 1;
                                                                i21++;
                                                            }
                                                        }
                                                        v16Var = new v16(jArr211, iArr7, i20, jArr210, iArr8);
                                                    }
                                                } else {
                                                    zzauzVar3 = zzauzVar4;
                                                    jArr5 = zzawkVar.zzi;
                                                    if (jArr5.length == 1) {
                                                        c = 0;
                                                        if (jArr5[0] == 0) {
                                                            i23 = 0;
                                                            while (i23 < jArr2.length) {
                                                                jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                                i23++;
                                                                c = 0;
                                                            }
                                                            v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                        }
                                                    }
                                                    if (zzawkVar.zzb == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    i15 = 0;
                                                    i16 = 0;
                                                    i17 = 0;
                                                    z5 = false;
                                                    while (true) {
                                                        jArr6 = zzawkVar.zzi;
                                                        j6 = -1;
                                                        if (i15 < jArr6.length) {
                                                            break;
                                                            break;
                                                        }
                                                        int[] iArr111 = iArr4;
                                                        int[] iArr112 = iArr3;
                                                        j9 = zzawkVar.zzj[i15];
                                                        if (j9 != -1) {
                                                            long jZzj12 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                            iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                            int iZzb10 = zzban.zzb(jArr2, j9 + jZzj12, z4, false);
                                                            int i516 = (iZzb10 - iZzb4) + i16;
                                                            if (i17 != iZzb4) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            z5 = z8 | z5;
                                                            i17 = iZzb10;
                                                            i16 = i516;
                                                        }
                                                        i15++;
                                                        iArr3 = iArr112;
                                                        iArr4 = iArr111;
                                                    }
                                                    iArr5 = iArr4;
                                                    iArr6 = iArr3;
                                                    if (i16 != iZza) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    z7 = z6 | z5;
                                                    if (z7) {
                                                        jArr7 = new long[i16];
                                                    } else {
                                                        jArr7 = jArr3;
                                                    }
                                                    if (z7) {
                                                        iArr7 = new int[i16];
                                                    } else {
                                                        iArr7 = iArr6;
                                                    }
                                                    if (true == z7) {
                                                        i11 = 0;
                                                    }
                                                    if (z7) {
                                                        iArr8 = new int[i16];
                                                    } else {
                                                        iArr8 = iArr5;
                                                    }
                                                    jArr8 = new long[i16];
                                                    i18 = 0;
                                                    i19 = 0;
                                                    i20 = i11;
                                                    while (true) {
                                                        jArr9 = zzawkVar.zzi;
                                                        if (i18 < jArr9.length) {
                                                            break;
                                                            break;
                                                        }
                                                        jArr10 = jArr8;
                                                        jArr11 = jArr7;
                                                        j7 = zzawkVar.zzj[i18];
                                                        j8 = jArr9[i18];
                                                        if (j7 != j6) {
                                                            long jZzj13 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                            iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                            iZzb3 = zzban.zzb(jArr2, jZzj13 + j7, z4, false);
                                                            if (z7) {
                                                                int i517 = iZzb3 - iZzb2;
                                                                jArr14 = jArr11;
                                                                System.arraycopy(jArr3, iZzb2, jArr14, i19, i517);
                                                                iArr9 = iArr6;
                                                                System.arraycopy(iArr9, iZzb2, iArr7, i19, i517);
                                                                iArr10 = iArr5;
                                                                System.arraycopy(iArr10, iZzb2, iArr8, i19, i517);
                                                            } else {
                                                                jArr14 = jArr11;
                                                                iArr9 = iArr6;
                                                                iArr10 = iArr5;
                                                            }
                                                            int i518 = i20;
                                                            while (iZzb2 < iZzb3) {
                                                                long[] jArr113 = jArr14;
                                                                long[] jArr212 = jArr3;
                                                                long j111 = j7;
                                                                jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                                if (!z7) {
                                                                }
                                                                i19++;
                                                                iZzb2++;
                                                                jArr3 = jArr212;
                                                                j7 = j111;
                                                                jArr14 = jArr113;
                                                            }
                                                            jArr12 = jArr14;
                                                            jArr13 = jArr3;
                                                            i20 = i518;
                                                        } else {
                                                            jArr12 = jArr11;
                                                            z4 = z4;
                                                            iArr9 = iArr6;
                                                            zzauzVar3 = zzauzVar3;
                                                            iArr10 = iArr5;
                                                            jArr13 = jArr3;
                                                        }
                                                        j12 += j8;
                                                        i18++;
                                                        jArr3 = jArr13;
                                                        jArr7 = jArr12;
                                                        jArr8 = jArr10;
                                                        j6 = -1;
                                                        iArr5 = iArr10;
                                                        zzauzVar3 = zzauzVar3;
                                                        iArr6 = iArr9;
                                                        z4 = z4;
                                                    }
                                                    zzauzVar = zzauzVar3;
                                                    long[] jArr213 = jArr8;
                                                    long[] jArr214 = jArr7;
                                                    i21 = 0;
                                                    i22 = 0;
                                                    while (true) {
                                                        if (i21 < iArr8.length) {
                                                            if (i22 == 0) {
                                                                throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                            }
                                                            break;
                                                        } else if (i22 == 0) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i22 = iArr8[i21] & 1;
                                                            i21++;
                                                        }
                                                    }
                                                    v16Var = new v16(jArr214, iArr7, i20, jArr213, iArr8);
                                                }
                                                v16Var = v16Var2;
                                                zzauzVar = zzauzVar3;
                                            }
                                        } else {
                                            zzauzVar3 = zzauzVar4;
                                            jArr5 = zzawkVar.zzi;
                                            if (jArr5.length == 1) {
                                                c = 0;
                                                if (jArr5[0] == 0) {
                                                    i23 = 0;
                                                    while (i23 < jArr2.length) {
                                                        jArr2[i23] = zzban.zzj(jArr2[i23] - zzawkVar.zzj[c], 1000000L, zzawkVar.zzc);
                                                        i23++;
                                                        c = 0;
                                                    }
                                                    v16Var2 = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                                    v16Var = v16Var2;
                                                    zzauzVar = zzauzVar3;
                                                }
                                            }
                                            if (zzawkVar.zzb == 1) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            i15 = 0;
                                            i16 = 0;
                                            i17 = 0;
                                            z5 = false;
                                            while (true) {
                                                jArr6 = zzawkVar.zzi;
                                                j6 = -1;
                                                if (i15 < jArr6.length) {
                                                    break;
                                                }
                                                int[] iArr113 = iArr4;
                                                int[] iArr114 = iArr3;
                                                j9 = zzawkVar.zzj[i15];
                                                if (j9 != -1) {
                                                    long jZzj14 = zzban.zzj(jArr6[i15], zzawkVar.zzc, zzawkVar.zzd);
                                                    iZzb4 = zzban.zzb(jArr2, j9, true, true);
                                                    int iZzb11 = zzban.zzb(jArr2, j9 + jZzj14, z4, false);
                                                    int i519 = (iZzb11 - iZzb4) + i16;
                                                    if (i17 != iZzb4) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    z5 = z8 | z5;
                                                    i17 = iZzb11;
                                                    i16 = i519;
                                                }
                                                i15++;
                                                iArr3 = iArr114;
                                                iArr4 = iArr113;
                                            }
                                            iArr5 = iArr4;
                                            iArr6 = iArr3;
                                            if (i16 != iZza) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            z7 = z6 | z5;
                                            if (z7) {
                                                jArr7 = new long[i16];
                                            } else {
                                                jArr7 = jArr3;
                                            }
                                            if (z7) {
                                                iArr7 = new int[i16];
                                            } else {
                                                iArr7 = iArr6;
                                            }
                                            if (true == z7) {
                                                i11 = 0;
                                            }
                                            if (z7) {
                                                iArr8 = new int[i16];
                                            } else {
                                                iArr8 = iArr5;
                                            }
                                            jArr8 = new long[i16];
                                            i18 = 0;
                                            i19 = 0;
                                            i20 = i11;
                                            while (true) {
                                                jArr9 = zzawkVar.zzi;
                                                if (i18 < jArr9.length) {
                                                    break;
                                                }
                                                jArr10 = jArr8;
                                                jArr11 = jArr7;
                                                j7 = zzawkVar.zzj[i18];
                                                j8 = jArr9[i18];
                                                if (j7 != j6) {
                                                    long jZzj15 = zzban.zzj(j8, zzawkVar.zzc, zzawkVar.zzd);
                                                    iZzb2 = zzban.zzb(jArr2, j7, true, true);
                                                    iZzb3 = zzban.zzb(jArr2, jZzj15 + j7, z4, false);
                                                    if (z7) {
                                                        int i5110 = iZzb3 - iZzb2;
                                                        jArr14 = jArr11;
                                                        System.arraycopy(jArr3, iZzb2, jArr14, i19, i5110);
                                                        iArr9 = iArr6;
                                                        System.arraycopy(iArr9, iZzb2, iArr7, i19, i5110);
                                                        iArr10 = iArr5;
                                                        System.arraycopy(iArr10, iZzb2, iArr8, i19, i5110);
                                                    } else {
                                                        jArr14 = jArr11;
                                                        iArr9 = iArr6;
                                                        iArr10 = iArr5;
                                                    }
                                                    int i5111 = i20;
                                                    while (iZzb2 < iZzb3) {
                                                        long[] jArr114 = jArr14;
                                                        long[] jArr215 = jArr3;
                                                        long j112 = j7;
                                                        jArr10[i19] = zzban.zzj(j12, 1000000L, zzawkVar.zzd) + zzban.zzj(jArr2[iZzb2] - j7, 1000000L, zzawkVar.zzc);
                                                        if (!z7 && iArr7[i19] > i5111) {
                                                            i5111 = iArr9[iZzb2];
                                                        }
                                                        i19++;
                                                        iZzb2++;
                                                        jArr3 = jArr215;
                                                        j7 = j112;
                                                        jArr14 = jArr114;
                                                    }
                                                    jArr12 = jArr14;
                                                    jArr13 = jArr3;
                                                    i20 = i5111;
                                                } else {
                                                    jArr12 = jArr11;
                                                    z4 = z4;
                                                    iArr9 = iArr6;
                                                    zzauzVar3 = zzauzVar3;
                                                    iArr10 = iArr5;
                                                    jArr13 = jArr3;
                                                }
                                                j12 += j8;
                                                i18++;
                                                jArr3 = jArr13;
                                                jArr7 = jArr12;
                                                jArr8 = jArr10;
                                                j6 = -1;
                                                iArr5 = iArr10;
                                                zzauzVar3 = zzauzVar3;
                                                iArr6 = iArr9;
                                                z4 = z4;
                                            }
                                            zzauzVar = zzauzVar3;
                                            long[] jArr216 = jArr8;
                                            long[] jArr217 = jArr7;
                                            i21 = 0;
                                            i22 = 0;
                                            while (true) {
                                                if (i21 < iArr8.length) {
                                                    if (i22 == 0) {
                                                        throw new zzasv("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                    break;
                                                } else {
                                                    if (i22 == 0) {
                                                        break;
                                                    }
                                                    i22 = iArr8[i21] & 1;
                                                    i21++;
                                                }
                                            }
                                            v16Var = new v16(jArr217, iArr7, i20, jArr216, iArr8);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    j2 = j10;
                                }
                                jArr = new long[iZza];
                                iArr = new int[iZza];
                                jArr2 = new long[iZza];
                                iArr2 = new int[iZza];
                                iZze = 0;
                                zzawkVar = zzawkVarA;
                                iZzi4 = iZzi3;
                                j4 = 0;
                                j5 = 0;
                                i2 = 0;
                                iZzi5 = 0;
                                i3 = 0;
                                i4 = 0;
                                iZzi6 = iZzi10;
                                i5 = iZzi9;
                                i6 = iZzi;
                                while (i2 < iZza) {
                                    while (i3 == 0) {
                                        zzazy.zze(vu5Var.a());
                                        j4 = vu5Var.e;
                                        i3 = vu5Var.d;
                                        iZzi8 = iZzi8;
                                        i5 = i5;
                                    }
                                    i12 = iZzi8;
                                    int i60 = i5;
                                    if (zzbagVar6 != null) {
                                        while (iZzi5 == 0) {
                                            if (i6 > 0) {
                                                iZzi5 = 0;
                                                break;
                                            } else {
                                                iZzi5 = zzbagVar6.zzi();
                                                iZze = zzbagVar6.zze();
                                                i6--;
                                            }
                                        }
                                        iZzi5--;
                                    }
                                    int i61 = iZze;
                                    jArr[i2] = j4;
                                    iZzb = fv5Var.zzb();
                                    iArr[i2] = iZzb;
                                    if (iZzb > i4) {
                                        i13 = iZzb;
                                    } else {
                                        i13 = i4;
                                    }
                                    jArr2[i2] = j5 + ((long) i61);
                                    if (zzbagVar5 == null) {
                                        i14 = 1;
                                    } else {
                                        i14 = 0;
                                    }
                                    iArr2[i2] = i14;
                                    if (i2 == iZzi4) {
                                        iArr2[i2] = 1;
                                        iZzi2--;
                                        if (iZzi2 > 0) {
                                            iZzi4 = zzbagVar5.zzi() - 1;
                                        }
                                    }
                                    j5 += (long) iZzi6;
                                    iZzi7 = i60 - 1;
                                    if (iZzi7 != 0) {
                                        if (i12 > 0) {
                                            i12--;
                                            iZzi7 = zzbagVar4.zzi();
                                            iZzi6 = zzbagVar4.zzi();
                                        } else {
                                            iZzi7 = 0;
                                        }
                                    }
                                    j4 += (long) iArr[i2];
                                    i3--;
                                    i2++;
                                    i4 = i13;
                                    iZzi6 = iZzi6;
                                    iZzi4 = iZzi4;
                                    iZze = i61;
                                    iZzi8 = i12;
                                    i5 = iZzi7;
                                    jArr = jArr;
                                }
                                i7 = iZzi8;
                                i8 = i5;
                                jArr3 = jArr;
                                if (iZzi5 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zzazy.zzc(z2);
                                while (i6 > 0) {
                                    if (zzbagVar6.zzi() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    zzazy.zzc(z3);
                                    zzbagVar6.zze();
                                    i6--;
                                }
                                if (iZzi2 == 0) {
                                    if (i8 == 0) {
                                        if (i3 == 0) {
                                            if (i7 != 0) {
                                                i3 = 0;
                                            } else {
                                                zzawkVar = zzawkVar;
                                            }
                                            i11 = i4;
                                            iArr3 = iArr;
                                            iArr4 = iArr2;
                                            jArr4 = zzawkVar.zzi;
                                            if (jArr4 != null) {
                                                zzauzVar = zzauzVar4;
                                                zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                                v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                            } else {
                                                zzauzVar = zzauzVar4;
                                                zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                                v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                            }
                                        }
                                        i10 = 0;
                                    } else {
                                        i10 = i8;
                                    }
                                    iZzi2 = 0;
                                    i9 = i3;
                                } else {
                                    i9 = i3;
                                    i10 = i8;
                                }
                                StringBuilder sbA = a42.a("Inconsistent stbl box for track ", zzawkVar.zza, ": remainingSynchronizationSamples ", iZzi2, ", remainingSamplesAtTimestampDelta ");
                                sbA.append(i10);
                                sbA.append(", remainingSamplesInChunk ");
                                sbA.append(i9);
                                sbA.append(", remainingTimestampDeltaChanges ");
                                sbA.append(i7);
                                Log.w("AtomParsers", sbA.toString());
                                i11 = i4;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                                jArr4 = zzawkVar.zzi;
                                if (jArr4 != null) {
                                    zzauzVar = zzauzVar4;
                                    zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                    v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                } else {
                                    zzauzVar = zzauzVar4;
                                    zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                    v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                }
                            } else {
                                iZzi2 = 0;
                            }
                            iZzi3 = -1;
                            long j113 = 0;
                            if (fv5Var.mo33zzc()) {
                                arrayList = arrayList2;
                                j2 = j10;
                                if (!"audio/raw".equals(zzawkVarA.zzf.zzf)) {
                                }
                                jArr4 = zzawkVar.zzi;
                                if (jArr4 != null) {
                                    zzauzVar = zzauzVar4;
                                    zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                    v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                } else {
                                    zzauzVar = zzauzVar4;
                                    zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                    v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                }
                            } else {
                                arrayList = arrayList2;
                                j2 = j10;
                            }
                            jArr = new long[iZza];
                            iArr = new int[iZza];
                            jArr2 = new long[iZza];
                            iArr2 = new int[iZza];
                            iZze = 0;
                            zzawkVar = zzawkVarA;
                            iZzi4 = iZzi3;
                            j4 = 0;
                            j5 = 0;
                            i2 = 0;
                            iZzi5 = 0;
                            i3 = 0;
                            i4 = 0;
                            iZzi6 = iZzi10;
                            i5 = iZzi9;
                            i6 = iZzi;
                            while (i2 < iZza) {
                                while (i3 == 0) {
                                    zzazy.zze(vu5Var.a());
                                    j4 = vu5Var.e;
                                    i3 = vu5Var.d;
                                    iZzi8 = iZzi8;
                                    i5 = i5;
                                }
                                i12 = iZzi8;
                                int i62 = i5;
                                if (zzbagVar6 != null) {
                                    while (iZzi5 == 0) {
                                        if (i6 > 0) {
                                            iZzi5 = 0;
                                            break;
                                        } else {
                                            iZzi5 = zzbagVar6.zzi();
                                            iZze = zzbagVar6.zze();
                                            i6--;
                                        }
                                    }
                                    iZzi5--;
                                }
                                int i63 = iZze;
                                jArr[i2] = j4;
                                iZzb = fv5Var.zzb();
                                iArr[i2] = iZzb;
                                if (iZzb > i4) {
                                    i13 = iZzb;
                                } else {
                                    i13 = i4;
                                }
                                jArr2[i2] = j5 + ((long) i63);
                                if (zzbagVar5 == null) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                iArr2[i2] = i14;
                                if (i2 == iZzi4) {
                                    iArr2[i2] = 1;
                                    iZzi2--;
                                    if (iZzi2 > 0) {
                                        iZzi4 = zzbagVar5.zzi() - 1;
                                    }
                                }
                                j5 += (long) iZzi6;
                                iZzi7 = i62 - 1;
                                if (iZzi7 != 0) {
                                    if (i12 > 0) {
                                        i12--;
                                        iZzi7 = zzbagVar4.zzi();
                                        iZzi6 = zzbagVar4.zzi();
                                    } else {
                                        iZzi7 = 0;
                                    }
                                }
                                j4 += (long) iArr[i2];
                                i3--;
                                i2++;
                                i4 = i13;
                                iZzi6 = iZzi6;
                                iZzi4 = iZzi4;
                                iZze = i63;
                                iZzi8 = i12;
                                i5 = iZzi7;
                                jArr = jArr;
                            }
                            i7 = iZzi8;
                            i8 = i5;
                            jArr3 = jArr;
                            if (iZzi5 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zzazy.zzc(z2);
                            while (i6 > 0) {
                                if (zzbagVar6.zzi() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                zzazy.zzc(z3);
                                zzbagVar6.zze();
                                i6--;
                            }
                            if (iZzi2 == 0) {
                                if (i8 == 0) {
                                    if (i3 == 0) {
                                        if (i7 != 0) {
                                            i3 = 0;
                                        } else {
                                            zzawkVar = zzawkVar;
                                        }
                                        i11 = i4;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                        jArr4 = zzawkVar.zzi;
                                        if (jArr4 != null) {
                                            zzauzVar = zzauzVar4;
                                            zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                            v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                        } else {
                                            zzauzVar = zzauzVar4;
                                            zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                            v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                                        }
                                    }
                                    i10 = 0;
                                } else {
                                    i10 = i8;
                                }
                                iZzi2 = 0;
                                i9 = i3;
                            } else {
                                i9 = i3;
                                i10 = i8;
                            }
                            StringBuilder sbA2 = a42.a("Inconsistent stbl box for track ", zzawkVar.zza, ": remainingSynchronizationSamples ", iZzi2, ", remainingSamplesAtTimestampDelta ");
                            sbA2.append(i10);
                            sbA2.append(", remainingSamplesInChunk ");
                            sbA2.append(i9);
                            sbA2.append(", remainingTimestampDeltaChanges ");
                            sbA2.append(i7);
                            Log.w("AtomParsers", sbA2.toString());
                            i11 = i4;
                            iArr3 = iArr;
                            iArr4 = iArr2;
                            jArr4 = zzawkVar.zzi;
                            if (jArr4 != null) {
                                zzauzVar = zzauzVar4;
                                zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                            } else {
                                zzauzVar = zzauzVar4;
                                zzban.zzn(jArr2, 1000000L, zzawkVar.zzc);
                                v16Var = new v16(jArr3, iArr3, i11, jArr2, iArr4);
                            }
                        }
                        if (v16Var.a != 0) {
                            zzawiVar2 = this;
                            i = i37;
                            zzave zzaveVarZzbi = zzawiVar2.l.zzbi(i, zzawkVar.zzb);
                            s16 s16Var = new s16(zzawkVar, v16Var, zzaveVarZzbi);
                            zzass zzassVarZze = zzawkVar.zzf.zze(v16Var.d + 30);
                            if (zzawkVar.zzb == 1) {
                                if (zzauzVar.zza()) {
                                    zzauzVar2 = zzauzVar;
                                    zzassVarZze = zzassVarZze.zzd(zzauzVar2.zzb, zzauzVar2.zzc);
                                } else {
                                    zzauzVar2 = zzauzVar;
                                }
                                zzaxdVar2 = zzaxdVar;
                                if (zzaxdVar != null) {
                                    zzassVarZze = zzassVarZze.zzf(zzaxdVar2);
                                }
                            } else {
                                zzauzVar2 = zzauzVar;
                                zzaxdVar2 = zzaxdVar;
                            }
                            zzaveVarZzbi.zza(zzassVarZze);
                            jMax = Math.max(j2, zzawkVar.zze);
                            arrayList2 = arrayList;
                            arrayList2.add(s16Var);
                            long j20 = v16Var.b[0];
                            j11 = j20 < j3 ? j20 : j3;
                        }
                        int i64 = i + 1;
                        zzawiVar = zzawiVar2;
                        zzauzVar4 = zzauzVar2;
                        zzaxdVar = zzaxdVar2;
                        i37 = i64;
                        zzawiVar3 = zzawiVar;
                        j10 = jMax;
                        g16Var2 = g16Var;
                        stack2 = stack;
                    } else {
                        i37 = i37;
                        stack = stack2;
                        g16Var = g16Var2;
                        arrayList = arrayList2;
                        zzauzVar = zzauzVar4;
                        zzaxdVar = zzaxdVar;
                        j2 = j10;
                        j3 = j11;
                    }
                    zzawiVar2 = this;
                    zzauzVar2 = zzauzVar;
                    j11 = j3;
                    i = i37;
                    arrayList2 = arrayList;
                    jMax = j2;
                    zzaxdVar2 = zzaxdVar;
                    int i65 = i + 1;
                    zzawiVar = zzawiVar2;
                    zzauzVar4 = zzauzVar2;
                    zzaxdVar = zzaxdVar2;
                    i37 = i65;
                    zzawiVar3 = zzawiVar;
                    j10 = jMax;
                    g16Var2 = g16Var;
                    stack2 = stack;
                }
            } else {
                zzawiVar = zzawiVar4;
                if (!stack2.isEmpty()) {
                    ((g16) stack2.peek()).R0.add(g16Var2);
                }
            }
            zzawiVar4 = zzawiVar;
        }
        zzawi zzawiVar6 = zzawiVar4;
        if (zzawiVar3.e != 2) {
            zzawiVar6.e = 0;
            zzawiVar6.h = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final long zza() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final long zzb(long j) {
        int i;
        long j2 = Long.MAX_VALUE;
        for (s16 s16Var : this.m) {
            v16 v16Var = s16Var.b;
            int iZzc = zzban.zzc(v16Var.e, j, true, false);
            while (true) {
                i = -1;
                if (iZzc < 0) {
                    iZzc = -1;
                    break;
                }
                if ((v16Var.f[iZzc] & 1) != 0) {
                    break;
                }
                iZzc--;
            }
            if (iZzc == -1) {
                long[] jArr = v16Var.e;
                for (int iZzb = zzban.zzb(jArr, j, true, false); iZzb < jArr.length; iZzb++) {
                    if ((v16Var.f[iZzb] & 1) != 0) {
                        i = iZzb;
                        break;
                    }
                }
                iZzc = i;
            }
            long j3 = v16Var.b[iZzc];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzd(zzauw zzauwVar) {
        this.l = zzauwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zze(long j, long j2) {
        int i;
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            this.e = 0;
            this.h = 0;
            return;
        }
        s16[] s16VarArr = this.m;
        if (s16VarArr != null) {
            for (s16 s16Var : s16VarArr) {
                v16 v16Var = s16Var.b;
                int iZzc = zzban.zzc(v16Var.e, j2, true, false);
                while (true) {
                    i = -1;
                    if (iZzc < 0) {
                        iZzc = -1;
                        break;
                    } else if ((v16Var.f[iZzc] & 1) != 0) {
                        break;
                    } else {
                        iZzc--;
                    }
                }
                if (iZzc == -1) {
                    long[] jArr = v16Var.e;
                    for (int iZzb = zzban.zzb(jArr, j2, true, false); iZzb < jArr.length; iZzb++) {
                        if ((v16Var.f[iZzb] & 1) != 0) {
                            i = iZzb;
                            break;
                        }
                    }
                    iZzc = i;
                }
                s16Var.d = iZzc;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zzf(zzauu zzauuVar, zzava zzavaVar) throws InterruptedException, zzasv, EOFException {
        s16[] s16VarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.e;
            Stack stack = this.d;
            if (i == 0) {
                int i2 = this.h;
                zzbag zzbagVar = this.c;
                if (i2 == 0) {
                    if (!zzauuVar.zzh(zzbagVar.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.h = 8;
                    zzbagVar.zzv(0);
                    this.g = zzbagVar.zzm();
                    this.f = zzbagVar.zze();
                }
                if (this.g == 1) {
                    zzauuVar.zzh(zzbagVar.zza, 8, 8, false);
                    this.h += 8;
                    this.g = zzbagVar.zzn();
                }
                int i3 = this.f;
                if (i3 == i16.C || i3 == i16.E || i3 == i16.F || i3 == i16.G || i3 == i16.H || i3 == i16.Q) {
                    long jZzd = (zzauuVar.zzd() + this.g) - ((long) this.h);
                    stack.add(new g16(this.f, jZzd));
                    if (this.g == this.h) {
                        a(jZzd);
                    } else {
                        this.e = 0;
                        this.h = 0;
                    }
                } else {
                    if (i3 == i16.S || i3 == i16.D || i3 == i16.T || i3 == i16.U || i3 == i16.m0 || i3 == i16.n0 || i3 == i16.o0 || i3 == i16.R || i3 == i16.p0 || i3 == i16.q0 || i3 == i16.r0 || i3 == i16.s0 || i3 == i16.t0 || i3 == i16.P || i3 == i16.b || i3 == i16.A0) {
                        zzazy.zze(this.h == 8);
                        zzazy.zze(this.g <= 2147483647L);
                        zzbag zzbagVar2 = new zzbag((int) this.g);
                        this.i = zzbagVar2;
                        System.arraycopy(zzbagVar.zza, 0, zzbagVar2.zza, 0, 8);
                    } else {
                        this.i = null;
                    }
                    this.e = 1;
                }
            } else {
                if (i != 1) {
                    long j = Long.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        s16VarArr = this.m;
                        if (i4 >= s16VarArr.length) {
                            break;
                        }
                        s16 s16Var = s16VarArr[i4];
                        int i6 = s16Var.d;
                        v16 v16Var = s16Var.b;
                        if (i6 != v16Var.a) {
                            long j2 = v16Var.b[i6];
                            if (j2 < j) {
                                i5 = i4;
                                j = j2;
                            }
                        }
                        i4++;
                    }
                    if (i5 == -1) {
                        return -1;
                    }
                    s16 s16Var2 = s16VarArr[i5];
                    zzave zzaveVar = s16Var2.c;
                    int i7 = s16Var2.d;
                    v16 v16Var2 = s16Var2.b;
                    long j3 = v16Var2.b[i7];
                    int i8 = v16Var2.c[i7];
                    zzawk zzawkVar = s16Var2.a;
                    if (zzawkVar.zzg == 1) {
                        j3 += 8;
                        i8 -= 8;
                    }
                    long jZzd2 = (j3 - zzauuVar.zzd()) + ((long) this.j);
                    if (jZzd2 < 0 || jZzd2 >= 262144) {
                        zzavaVar.zza = j3;
                        return 1;
                    }
                    int i9 = (int) jZzd2;
                    boolean z3 = false;
                    zzauuVar.zzi(i9, false);
                    int i10 = zzawkVar.zzk;
                    if (i10 == 0) {
                        while (true) {
                            int i11 = this.j;
                            if (i11 >= i8) {
                                break;
                            }
                            int iZzd = zzaveVar.zzd(zzauuVar, i8 - i11, false);
                            this.j += iZzd;
                            this.k -= iZzd;
                        }
                    } else {
                        zzbag zzbagVar3 = this.b;
                        byte[] bArr = zzbagVar3.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i12 = 4 - i10;
                        while (this.j < i8) {
                            int i13 = this.k;
                            if (i13 == 0) {
                                zzauuVar.zzh(zzbagVar3.zza, i12, i10, z3);
                                zzbagVar3.zzv(z3 ? 1 : 0);
                                this.k = zzbagVar3.zzi();
                                zzbag zzbagVar4 = this.a;
                                zzbagVar4.zzv(z3 ? 1 : 0);
                                zzaveVar.zzb(zzbagVar4, 4);
                                this.j += 4;
                                i8 += i12;
                            } else {
                                int iZzd2 = zzaveVar.zzd(zzauuVar, i13, z3);
                                this.j += iZzd2;
                                this.k -= iZzd2;
                                z3 = false;
                            }
                        }
                    }
                    zzaveVar.zzc(v16Var2.e[i7], v16Var2.f[i7], i8, 0, null);
                    s16Var2.d++;
                    this.j = 0;
                    this.k = 0;
                    return 0;
                }
                long j4 = this.g;
                int i14 = this.h;
                long j5 = j4 - ((long) i14);
                long jZzd3 = zzauuVar.zzd() + j5;
                zzbag zzbagVar5 = this.i;
                if (zzbagVar5 != null) {
                    zzauuVar.zzh(zzbagVar5.zza, i14, (int) j5, false);
                    if (this.f == i16.b) {
                        zzbag zzbagVar6 = this.i;
                        zzbagVar6.zzv(8);
                        int iZze = zzbagVar6.zze();
                        int i15 = p;
                        if (iZze != i15) {
                            zzbagVar6.zzw(4);
                            while (true) {
                                if (zzbagVar6.zza() <= 0) {
                                    z2 = false;
                                    break;
                                }
                                if (zzbagVar6.zze() == i15) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                        this.o = z2;
                    } else if (!stack.isEmpty()) {
                        ((g16) stack.peek()).Q0.add(new h16(this.i, this.f));
                    }
                } else {
                    if (j5 < 262144) {
                        zzauuVar.zzi((int) j5, false);
                    } else {
                        zzavaVar.zza = zzauuVar.zzd() + j5;
                        z = true;
                    }
                    a(jZzd3);
                    if (z && this.e != 2) {
                        return 1;
                    }
                }
                z = false;
                a(jZzd3);
                if (z) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final boolean zzg(zzauu zzauuVar) {
        return t16.a(zzauuVar, false);
    }
}
