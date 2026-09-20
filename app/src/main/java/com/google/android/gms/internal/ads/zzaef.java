package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import defpackage.fu5;
import defpackage.gu5;
import defpackage.ku5;
import defpackage.lu5;
import defpackage.tp1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaef implements zzzf {
    public static final Map h0;
    public long A;
    public long B;
    public zzdv C;
    public zzdv D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final gu5 a;
    public boolean a0;
    public final lu5 b;
    public zzzi b0;
    public final SparseArray c;
    public final boolean d;
    public final zzed e;
    public final zzed f;
    public final zzed g;
    public final zzed h;
    public final zzed i;
    public final zzed j;
    public final zzed k;
    public final zzed l;
    public final zzed m;
    public final zzed n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public zzaee u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzaeb
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzaef(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0 = zzel.zzaa("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID g0 = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        h0 = Collections.unmodifiableMap(map);
    }

    public zzaef() {
        this(0);
    }

    public static byte[] k(String str, long j, long j2) {
        zzdd.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return zzel.zzaa(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    public final void a(double d, int i) throws zzbu {
        if (i == 181) {
            f(i);
            this.u.zzP = (int) d;
            return;
        }
        if (i == 17545) {
            this.s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                f(i);
                this.u.zzC = (float) d;
                break;
            case 21970:
                f(i);
                this.u.zzD = (float) d;
                break;
            case 21971:
                f(i);
                this.u.zzE = (float) d;
                break;
            case 21972:
                f(i);
                this.u.zzF = (float) d;
                break;
            case 21973:
                f(i);
                this.u.zzG = (float) d;
                break;
            case 21974:
                f(i);
                this.u.zzH = (float) d;
                break;
            case 21975:
                f(i);
                this.u.zzI = (float) d;
                break;
            case 21976:
                f(i);
                this.u.zzJ = (float) d;
                break;
            case 21977:
                f(i);
                this.u.zzK = (float) d;
                break;
            case 21978:
                f(i);
                this.u.zzL = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        f(i);
                        this.u.zzr = (float) d;
                        break;
                    case 30324:
                        f(i);
                        this.u.zzs = (float) d;
                        break;
                    case 30325:
                        f(i);
                        this.u.zzt = (float) d;
                        break;
                }
                break;
        }
    }

    public final void b(int i, String str) throws zzbu {
        if (i == 134) {
            f(i);
            this.u.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbu.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            f(i);
            this.u.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            f(i);
            this.u.b = str;
        }
    }

    @RequiresNonNull({"#2.output"})
    public final int c(zzzg zzzgVar, zzaee zzaeeVar, int i, boolean z) throws zzbu, EOFException, InterruptedIOException {
        int iZza;
        int iZza2;
        int i2;
        if ("S_TEXT/UTF8".equals(zzaeeVar.zzb)) {
            j(zzzgVar, c0, i);
            int i3 = this.T;
            i();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzaeeVar.zzb)) {
            j(zzzgVar, e0, i);
            int i4 = this.T;
            i();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzaeeVar.zzb)) {
            j(zzzgVar, f0, i);
            int i5 = this.T;
            i();
            return i5;
        }
        zzaam zzaamVar = zzaeeVar.zzV;
        boolean z2 = this.V;
        zzed zzedVar = this.j;
        if (!z2) {
            boolean z3 = zzaeeVar.zzg;
            zzed zzedVar2 = this.g;
            if (z3) {
                this.O &= -1073741825;
                if (!this.W) {
                    ((zzyv) zzzgVar).zzn(zzedVar2.zzH(), 0, 1, false);
                    this.S++;
                    if ((zzedVar2.zzH()[0] & 128) == 128) {
                        throw zzbu.zza("Extension bit is set in signal byte", null);
                    }
                    this.Z = zzedVar2.zzH()[0];
                    this.W = true;
                }
                byte b = this.Z;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        zzed zzedVar3 = this.l;
                        ((zzyv) zzzgVar).zzn(zzedVar3.zzH(), 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        zzedVar2.zzH()[0] = (byte) ((i6 == 2 ? 128 : 0) | 8);
                        zzedVar2.zzF(0);
                        zzaamVar.zzr(zzedVar2, 1, 1);
                        this.T++;
                        zzedVar3.zzF(0);
                        zzaamVar.zzr(zzedVar3, 8, 1);
                        this.T += 8;
                    }
                    if (i6 == 2) {
                        if (!this.X) {
                            ((zzyv) zzzgVar).zzn(zzedVar2.zzH(), 0, 1, false);
                            this.S++;
                            zzedVar2.zzF(0);
                            this.Y = zzedVar2.zzk();
                            this.X = true;
                        }
                        int i7 = this.Y * 4;
                        zzedVar2.zzC(i7);
                        ((zzyv) zzzgVar).zzn(zzedVar2.zzH(), 0, i7, false);
                        this.S += i7;
                        int i8 = (this.Y >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.o = ByteBuffer.allocate(i9);
                        }
                        this.o.position(0);
                        this.o.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzn = zzedVar2.zzn();
                            if (i10 % 2 == 0) {
                                this.o.putShort((short) (iZzn - i11));
                            } else {
                                this.o.putInt(iZzn - i11);
                            }
                            i10++;
                            i11 = iZzn;
                        }
                        int i12 = (i - this.S) - i11;
                        if ((i2 & 1) == 1) {
                            this.o.putInt(i12);
                        } else {
                            this.o.putShort((short) i12);
                            this.o.putInt(0);
                        }
                        byte[] bArrArray = this.o.array();
                        zzed zzedVar4 = this.m;
                        zzedVar4.zzD(bArrArray, i9);
                        zzaamVar.zzr(zzedVar4, i9, 1);
                        this.T += i9;
                    }
                }
            } else {
                byte[] bArr = zzaeeVar.zzh;
                if (bArr != null) {
                    zzedVar.zzD(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaeeVar.zzb) ? zzaeeVar.zzf > 0 : z) {
                this.O |= 268435456;
                this.n.zzC(0);
                int iZzd = (zzedVar.zzd() + i) - this.S;
                zzedVar2.zzC(4);
                zzedVar2.zzH()[0] = (byte) ((iZzd >> 24) & 255);
                zzedVar2.zzH()[1] = (byte) ((iZzd >> 16) & 255);
                zzedVar2.zzH()[2] = (byte) ((iZzd >> 8) & 255);
                zzedVar2.zzH()[3] = (byte) (iZzd & 255);
                zzaamVar.zzr(zzedVar2, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iZzd2 = zzedVar.zzd() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzaeeVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaeeVar.zzb)) {
            if (zzaeeVar.zzS != null) {
                zzdd.zzf(zzedVar.zzd() == 0);
                zzaeeVar.zzS.zzd(zzzgVar);
            }
            while (true) {
                int i13 = this.S;
                if (i13 >= iZzd2) {
                    break;
                }
                int i14 = iZzd2 - i13;
                int iZza3 = zzedVar.zza();
                if (iZza3 > 0) {
                    iZza2 = Math.min(i14, iZza3);
                    zzaak.zzb(zzaamVar, zzedVar, iZza2);
                } else {
                    iZza2 = zzaak.zza(zzaamVar, zzzgVar, i14, false);
                }
                this.S += iZza2;
                this.T += iZza2;
            }
        } else {
            zzed zzedVar5 = this.f;
            byte[] bArrZzH = zzedVar5.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i15 = zzaeeVar.zzW;
            int i16 = 4 - i15;
            while (this.S < iZzd2) {
                int i17 = this.U;
                if (i17 == 0) {
                    int iMin = Math.min(i15, zzedVar.zza());
                    ((zzyv) zzzgVar).zzn(bArrZzH, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        zzedVar.zzB(bArrZzH, i16, iMin);
                    }
                    this.S += i15;
                    zzedVar5.zzF(0);
                    this.U = zzedVar5.zzn();
                    zzed zzedVar6 = this.e;
                    zzedVar6.zzF(0);
                    zzaak.zzb(zzaamVar, zzedVar6, 4);
                    this.T += 4;
                } else {
                    int iZza4 = zzedVar.zza();
                    if (iZza4 > 0) {
                        iZza = Math.min(i17, iZza4);
                        zzaak.zzb(zzaamVar, zzedVar, iZza);
                    } else {
                        iZza = zzaak.zza(zzaamVar, zzzgVar, i17, false);
                    }
                    this.S += iZza;
                    this.T += iZza;
                    this.U -= iZza;
                }
            }
        }
        if ("A_VORBIS".equals(zzaeeVar.zzb)) {
            zzed zzedVar7 = this.h;
            zzedVar7.zzF(0);
            zzaak.zzb(zzaamVar, zzedVar7, 4);
            this.T += 4;
        }
        int i18 = this.T;
        i();
        return i18;
    }

    public final long d(long j) throws zzbu {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return zzel.zzw(j, j2, 1000L);
        }
        throw zzbu.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void e(int i) throws zzbu {
        if (this.C == null || this.D == null) {
            throw zzbu.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void f(int i) throws zzbu {
        if (this.u != null) {
            return;
        }
        throw zzbu.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @RequiresNonNull({"#1.output"})
    public final void g(zzaee zzaeeVar, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrK;
        int i4;
        int iZzd;
        zzaan zzaanVar = zzaeeVar.zzS;
        if (zzaanVar != null) {
            zzaanVar.zzc(zzaeeVar.zzV, j, i, i2, i3, zzaeeVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzaeeVar.zzb) || "S_TEXT/ASS".equals(zzaeeVar.zzb) || "S_TEXT/WEBVTT".equals(zzaeeVar.zzb)) {
                if (this.K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzaeeVar.zzb;
                        zzed zzedVar = this.k;
                        byte[] bArrZzH = zzedVar.zzH();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrK = k("%02d:%02d:%02d,%03d", j2, 1000L);
                            i4 = 19;
                        } else if (b == 1) {
                            bArrK = k("%01d:%02d:%02d:%02d", j2, 10000L);
                            i4 = 21;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrK = k("%02d:%02d:%02d.%03d", j2, 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(bArrK, 0, bArrZzH, i4, bArrK.length);
                        for (int iZzc = zzedVar.zzc(); iZzc < zzedVar.zzd(); iZzc++) {
                            if (zzedVar.zzH()[iZzc] == 0) {
                                zzedVar.zzE(iZzc);
                                break;
                            }
                        }
                        zzaak.zzb(zzaeeVar.zzV, zzedVar, zzedVar.zzd());
                        iZzd = zzedVar.zzd() + i2;
                    }
                }
                iZzd = i2;
            } else {
                iZzd = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.K;
                zzed zzedVar2 = this.n;
                if (i5 > 1) {
                    zzedVar2.zzC(0);
                } else {
                    int iZzd2 = zzedVar2.zzd();
                    zzaeeVar.zzV.zzr(zzedVar2, iZzd2, 2);
                    iZzd += iZzd2;
                }
            }
            zzaeeVar.zzV.zzs(j, i, iZzd, i3, zzaeeVar.zzi);
        }
        this.F = true;
    }

    public final void h(zzzg zzzgVar, int i) throws EOFException, InterruptedIOException {
        zzed zzedVar = this.g;
        if (zzedVar.zzd() >= i) {
            return;
        }
        if (zzedVar.zzb() < i) {
            int iZzb = zzedVar.zzb();
            zzedVar.zzz(Math.max(iZzb + iZzb, i));
        }
        ((zzyv) zzzgVar).zzn(zzedVar.zzH(), zzedVar.zzd(), i - zzedVar.zzd(), false);
        zzedVar.zzE(i);
    }

    public final void i() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.zzC(0);
    }

    public final void j(zzzg zzzgVar, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length;
        int i2 = length + i;
        zzed zzedVar = this.k;
        if (zzedVar.zzb() < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzedVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzedVar.zzH(), 0, length);
        }
        ((zzyv) zzzgVar).zzn(zzedVar.zzH(), length, i, false);
        zzedVar.zzF(0);
        zzedVar.zzE(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:222:0x0382  */
    /* JADX WARN: Code duplicated, block: B:295:0x04db  */
    /* JADX WARN: Code duplicated, block: B:296:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:297:0x04df  */
    /* JADX WARN: Code duplicated, block: B:298:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:299:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:306:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:308:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:310:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:319:0x0526 A[LOOP:9: B:318:0x0524->B:319:0x0526, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:322:0x0535  */
    /* JADX WARN: Code duplicated, block: B:323:0x053c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0548  */
    /* JADX WARN: Code duplicated, block: B:365:0x064e  */
    /* JADX WARN: Code duplicated, block: B:367:0x0655  */
    /* JADX WARN: Code duplicated, block: B:368:0x0674  */
    /* JADX WARN: Code duplicated, block: B:371:0x0680  */
    /* JADX WARN: Code duplicated, block: B:372:0x068d  */
    /* JADX WARN: Code duplicated, block: B:374:0x0697  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:378:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:379:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:382:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:384:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:386:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:387:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:390:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:393:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:394:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:396:0x0701  */
    /* JADX WARN: Code duplicated, block: B:399:0x0709  */
    /* JADX WARN: Code duplicated, block: B:403:0x072b A[LOOP:11: B:400:0x070d->B:403:0x072b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:406:0x0739  */
    /* JADX WARN: Code duplicated, block: B:408:0x073c  */
    /* JADX WARN: Code duplicated, block: B:411:0x0744  */
    /* JADX WARN: Code duplicated, block: B:413:0x0758  */
    /* JADX WARN: Code duplicated, block: B:416:0x075d  */
    /* JADX WARN: Code duplicated, block: B:420:0x0780 A[LOOP:14: B:419:0x077e->B:420:0x0780, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:423:0x079f  */
    /* JADX WARN: Code duplicated, block: B:424:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:426:0x07b2 A[LOOP:13: B:414:0x0759->B:426:0x07b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:443:0x0825  */
    /* JADX WARN: Code duplicated, block: B:445:0x0829  */
    /* JADX WARN: Code duplicated, block: B:449:0x0839 A[PHI: r8
  0x0839: PHI (r8v4 int) = (r8v1 int), (r8v7 int) binds: [B:442:0x0823, B:446:0x0834] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:455:0x084e A[LOOP:15: B:455:0x084e->B:457:0x0854, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:457:0x0854 A[LOOP:15: B:455:0x084e->B:457:0x0854, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:459:0x0889  */
    /* JADX WARN: Code duplicated, block: B:462:0x0892 A[LOOP:16: B:460:0x088b->B:462:0x0892, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:465:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:467:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:469:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:470:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:472:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:474:0x08ca A[LOOP:17: B:471:0x08c2->B:474:0x08ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:479:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:481:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:483:0x0902 A[LOOP:18: B:482:0x0900->B:483:0x0902, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:486:0x0918  */
    /* JADX WARN: Code duplicated, block: B:488:0x091e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0921  */
    /* JADX WARN: Code duplicated, block: B:491:0x0926  */
    /* JADX WARN: Code duplicated, block: B:492:0x092a  */
    /* JADX WARN: Code duplicated, block: B:493:0x0934  */
    /* JADX WARN: Code duplicated, block: B:495:0x093a  */
    /* JADX WARN: Code duplicated, block: B:497:0x093d  */
    /* JADX WARN: Code duplicated, block: B:499:0x0940  */
    /* JADX WARN: Code duplicated, block: B:502:0x0945  */
    /* JADX WARN: Code duplicated, block: B:503:0x094b  */
    /* JADX WARN: Code duplicated, block: B:504:0x0951  */
    /* JADX WARN: Code duplicated, block: B:505:0x0957  */
    /* JADX WARN: Code duplicated, block: B:506:0x095e  */
    /* JADX WARN: Code duplicated, block: B:507:0x0962  */
    /* JADX WARN: Code duplicated, block: B:508:0x096c  */
    /* JADX WARN: Code duplicated, block: B:509:0x0975  */
    /* JADX WARN: Code duplicated, block: B:510:0x097e  */
    /* JADX WARN: Code duplicated, block: B:511:0x0988  */
    /* JADX WARN: Code duplicated, block: B:513:0x0991  */
    /* JADX WARN: Code duplicated, block: B:514:0x0993  */
    /* JADX WARN: Code duplicated, block: B:516:0x0998  */
    /* JADX WARN: Code duplicated, block: B:517:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:518:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:519:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:521:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:523:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:525:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:528:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:529:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:530:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:531:0x09db  */
    /* JADX WARN: Code duplicated, block: B:532:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:533:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:561:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:565:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:566:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:567:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:568:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:570:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:571:0x0add  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:573:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:575:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:576:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:578:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:580:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:583:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:589:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:599:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:606:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:608:0x0bc6  */
    /* JADX WARN: Code duplicated, block: B:610:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:612:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bd2  */
    /* JADX WARN: Code duplicated, block: B:616:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:620:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:622:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:631:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c1f  */
    /* JADX WARN: Code duplicated, block: B:641:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:642:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:645:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:647:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:650:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:653:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:655:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:664:0x0ca1  */
    /* JADX WARN: Code duplicated, block: B:666:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:670:0x0cbc A[LOOP:1: B:6:0x0014->B:670:0x0cbc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:682:0x0842 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x07ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x07e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x09ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0a0e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0a2c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0a6d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0b59 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0b7b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0c96 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x0c78 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x0c8d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0c93 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x0c93 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0cba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0cb7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x072d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x07f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x07bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0880 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x08a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x08cc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        lu5 lu5Var;
        boolean z;
        int i;
        zzaef zzaefVar;
        char c;
        long jZzf;
        int i2;
        long j;
        zzaef zzaefVar2;
        boolean z2;
        long j2;
        long j3;
        int i3;
        int i4;
        long j4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int iZzb;
        zzaee zzaeeVar;
        int iZza;
        long j5;
        int i8;
        byte[] bArr;
        int i9;
        String str;
        int i10;
        int i11;
        SparseArray sparseArray;
        int i12;
        zzed zzedVar;
        zzaee zzaeeVar2;
        int i13;
        int i14;
        int i15;
        gu5 gu5Var;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int length;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        zzed zzedVar2;
        int i24;
        int i25;
        zzed zzedVar3;
        long j6;
        int i26;
        int i27;
        int i28;
        long j7;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int[] iArr2;
        int length2;
        long j8;
        int i35;
        int i36;
        long j9;
        double dLongBitsToDouble;
        long j10;
        boolean z5;
        int i37;
        SparseArray sparseArray2;
        zzaee zzaeeVar3;
        zzaan zzaanVar;
        long jZzf2;
        long j11;
        int i38;
        zzaai zzaahVar;
        zzaef zzaefVar3 = this;
        zzzg zzzgVar2 = zzzgVar;
        zzaefVar3.F = false;
        while (!zzaefVar3.F) {
            gu5 gu5Var2 = zzaefVar3.a;
            zzdd.zzb(gu5Var2.d);
            while (true) {
                ArrayDeque arrayDeque = gu5Var2.b;
                fu5 fu5Var = (fu5) arrayDeque.peek();
                if (fu5Var == null || zzzgVar.zzf() < fu5Var.b) {
                    ?? r6 = 0;
                    int i39 = gu5Var2.e;
                    byte[] bArr2 = gu5Var2.a;
                    lu5 lu5Var2 = gu5Var2.c;
                    if (i39 == 0) {
                        int i40 = 4;
                        long jB = lu5Var2.b(zzzgVar2, true, false, 4);
                        if (jB == -2) {
                            zzzgVar.zzj();
                            while (true) {
                                zzyv zzyvVar = (zzyv) zzzgVar2;
                                zzyvVar.zzm(bArr2, r6, i40, r6);
                                byte b = bArr2[r6];
                                int i41 = 0;
                                while (true) {
                                    if (i41 < 8) {
                                        lu5Var = lu5Var2;
                                        long j12 = lu5.d[i41] & ((long) b);
                                        i41++;
                                        if (j12 == 0) {
                                            lu5Var2 = lu5Var;
                                        }
                                    } else {
                                        lu5Var = lu5Var2;
                                        i41 = -1;
                                    }
                                }
                                if (i41 != -1 && i41 <= 4) {
                                    int iA = (int) lu5.a(false, i41, bArr2);
                                    zzaef zzaefVar4 = ((ku5) gu5Var2.d).a;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                        zzyvVar.zzo(i41, false);
                                        j10 = iA;
                                        z = true;
                                    }
                                }
                                zzyvVar.zzo(1, false);
                                lu5Var2 = lu5Var;
                                r6 = 0;
                                i40 = 4;
                            }
                        } else {
                            lu5Var = lu5Var2;
                            z = true;
                            j10 = jB;
                        }
                        if (j10 == -1) {
                            z2 = false;
                            z5 = false;
                        } else {
                            gu5Var2.f = (int) j10;
                            gu5Var2.e = z ? 1 : 0;
                        }
                        if (z5) {
                            jZzf2 = zzzgVar.zzf();
                            zzaefVar3 = this;
                            if (zzaefVar3.y) {
                                zzaefVar3.A = jZzf2;
                                zzaafVar.zza = zzaefVar3.z;
                                zzaefVar3.y = z2;
                                return 1;
                            }
                            if (zzaefVar3.v) {
                                j11 = zzaefVar3.A;
                                if (j11 != -1) {
                                    zzaafVar.zza = j11;
                                    zzaefVar3.A = -1L;
                                    return 1;
                                }
                            }
                        } else {
                            i37 = 0;
                            while (true) {
                                sparseArray2 = this.c;
                                if (i37 < sparseArray2.size()) {
                                    return -1;
                                }
                                zzaeeVar3 = (zzaee) sparseArray2.valueAt(i37);
                                zzaeeVar3.zzV.getClass();
                                zzaanVar = zzaeeVar3.zzS;
                                if (zzaanVar != null) {
                                    zzaanVar.zza(zzaeeVar3.zzV, zzaeeVar3.zzi);
                                }
                                i37++;
                            }
                        }
                    } else {
                        lu5Var = lu5Var2;
                        z = true;
                        if (i39 == 1) {
                        }
                        zzadz zzadzVar = gu5Var2.d;
                        i = gu5Var2.f;
                        zzaefVar = ((ku5) zzadzVar).a;
                        switch (i) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                c = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                c = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                c = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                c = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                c = 5;
                                break;
                            default:
                                c = 0;
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                jZzf = zzzgVar.zzf();
                                arrayDeque.push(new fu5(i, gu5Var2.g + jZzf));
                                zzadz zzadzVar2 = gu5Var2.d;
                                i2 = gu5Var2.f;
                                j = gu5Var2.g;
                                zzaefVar2 = ((ku5) zzadzVar2).a;
                                zzdd.zzb(zzaefVar2.b0);
                                if (i2 != 160) {
                                    z2 = false;
                                    zzaefVar2.Q = false;
                                    zzaefVar2.R = 0L;
                                } else if (i2 != 174) {
                                    z2 = false;
                                    zzaefVar2.u = new zzaee();
                                } else if (i2 != 187) {
                                    if (i2 != 19899) {
                                        zzaefVar2.w = -1;
                                        zzaefVar2.x = -1L;
                                    } else if (i2 != 20533) {
                                        zzaefVar2.f(i2);
                                        zzaefVar2.u.zzg = true;
                                    } else if (i2 != 21968) {
                                        zzaefVar2.f(i2);
                                        zzaefVar2.u.zzw = true;
                                    } else if (i2 != 408125543) {
                                        j2 = zzaefVar2.q;
                                        if (j2 == -1 && j2 != jZzf) {
                                            throw zzbu.zza("Multiple Segment elements not supported", null);
                                        }
                                        zzaefVar2.q = jZzf;
                                        zzaefVar2.p = j;
                                    } else if (i2 != 475249515) {
                                        zzaefVar2.C = new zzdv(32);
                                        zzaefVar2.D = new zzdv(32);
                                    } else if (i2 == 524531317 && !zzaefVar2.v) {
                                        if (zzaefVar2.d || zzaefVar2.z == -1) {
                                            zzaefVar2.b0.zzL(new zzaah(zzaefVar2.t, 0L));
                                            zzaefVar2.v = true;
                                        } else {
                                            zzaefVar2.y = true;
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    zzaefVar2.E = false;
                                }
                                gu5Var2.e = z2 ? 1 : 0;
                            } else if (c != 2) {
                                j3 = gu5Var2.g;
                                if (j3 <= 8) {
                                    throw zzbu.zza("Invalid integer size: " + j3, null);
                                }
                                i3 = (int) j3;
                                ((zzyv) zzzgVar2).zzn(bArr2, 0, i3, false);
                                j4 = 0;
                                for (i4 = 0; i4 < i3; i4++) {
                                    j4 = (j4 << 8) | ((long) (bArr2[i4] & 255));
                                }
                                zzaefVar.getClass();
                                if (i != 20529) {
                                    if (i != 20530) {
                                        switch (i) {
                                            case 131:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzd = (int) j4;
                                                break;
                                            case 136:
                                                zzaefVar.f(i);
                                                zzaee zzaeeVar4 = zzaefVar.u;
                                                if (j4 == 1) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                zzaeeVar4.zzU = z3;
                                                break;
                                            case 155:
                                                zzaefVar.I = zzaefVar.d(j4);
                                                break;
                                            case 159:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzN = (int) j4;
                                                break;
                                            case 176:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzl = (int) j4;
                                                break;
                                            case 179:
                                                zzaefVar.e(i);
                                                zzaefVar.C.zzc(zzaefVar.d(j4));
                                                break;
                                            case 186:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzm = (int) j4;
                                                break;
                                            case 215:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzc = (int) j4;
                                                break;
                                            case 231:
                                                zzaefVar.B = zzaefVar.d(j4);
                                                break;
                                            case 238:
                                                zzaefVar.P = (int) j4;
                                                break;
                                            case 241:
                                                if (!zzaefVar.E) {
                                                    zzaefVar.e(i);
                                                    zzaefVar.D.zzc(j4);
                                                    zzaefVar.E = true;
                                                }
                                                break;
                                            case 251:
                                                zzaefVar.Q = true;
                                                break;
                                            case 16871:
                                                zzaefVar.f(i);
                                                zzaefVar.u.a = (int) j4;
                                                break;
                                            case 16980:
                                                if (j4 != 3) {
                                                    throw zzbu.zza("ContentCompAlgo " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 17029:
                                                if (j4 >= 1 || j4 > 2) {
                                                    throw zzbu.zza("DocTypeReadVersion " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 17143:
                                                if (j4 != 1) {
                                                    throw zzbu.zza("EBMLReadVersion " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 18401:
                                                if (j4 != 5) {
                                                    throw zzbu.zza("ContentEncAlgo " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 18408:
                                                if (j4 != 1) {
                                                    throw zzbu.zza("AESSettingsCipherMode " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 21420:
                                                zzaefVar.x = j4 + zzaefVar.q;
                                                break;
                                            case 21432:
                                                zzaefVar.f(i);
                                                i5 = (int) j4;
                                                if (i5 != 0) {
                                                    zzaefVar.u.zzv = 0;
                                                } else if (i5 != 1) {
                                                    zzaefVar.u.zzv = 2;
                                                } else if (i5 != 3) {
                                                    zzaefVar.u.zzv = 1;
                                                } else if (i5 == 15) {
                                                    zzaefVar.u.zzv = 3;
                                                }
                                                break;
                                            case 21680:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzn = (int) j4;
                                                break;
                                            case 21682:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzp = (int) j4;
                                                break;
                                            case 21690:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzo = (int) j4;
                                                break;
                                            case 21930:
                                                zzaefVar.f(i);
                                                zzaee zzaeeVar5 = zzaefVar.u;
                                                if (j4 == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                zzaeeVar5.zzT = z4;
                                                break;
                                            case 21998:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzf = (int) j4;
                                                break;
                                            case 22186:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzQ = j4;
                                                break;
                                            case 22203:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzR = j4;
                                                break;
                                            case 25188:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zzO = (int) j4;
                                                break;
                                            case 30114:
                                                zzaefVar.R = j4;
                                                break;
                                            case 30321:
                                                zzaefVar.f(i);
                                                i6 = (int) j4;
                                                if (i6 != 0) {
                                                    zzaefVar.u.zzq = 0;
                                                } else if (i6 != 1) {
                                                    zzaefVar.u.zzq = 1;
                                                } else if (i6 != 2) {
                                                    zzaefVar.u.zzq = 2;
                                                } else if (i6 == 3) {
                                                    zzaefVar.u.zzq = 3;
                                                }
                                                break;
                                            case 2352003:
                                                zzaefVar.f(i);
                                                zzaefVar.u.zze = (int) j4;
                                                break;
                                            case 2807729:
                                                zzaefVar.r = j4;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 21945:
                                                        zzaefVar.f(i);
                                                        i7 = (int) j4;
                                                        if (i7 != 1) {
                                                            zzaefVar.u.zzz = 2;
                                                        } else if (i7 == 2) {
                                                            zzaefVar.u.zzz = 1;
                                                        }
                                                        break;
                                                    case 21946:
                                                        zzaefVar.f(i);
                                                        iZzb = zzq.zzb((int) j4);
                                                        if (iZzb != -1) {
                                                            zzaefVar.u.zzy = iZzb;
                                                        }
                                                        break;
                                                    case 21947:
                                                        zzaefVar.f(i);
                                                        zzaeeVar = zzaefVar.u;
                                                        zzaeeVar.zzw = true;
                                                        iZza = zzq.zza((int) j4);
                                                        if (iZza != -1) {
                                                            zzaeeVar.zzx = iZza;
                                                        }
                                                        break;
                                                    case 21948:
                                                        zzaefVar.f(i);
                                                        zzaefVar.u.zzA = (int) j4;
                                                        break;
                                                    case 21949:
                                                        zzaefVar.f(i);
                                                        zzaefVar.u.zzB = (int) j4;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else if (j4 != 1) {
                                        throw zzbu.zza("ContentEncodingScope " + j4 + " not supported", null);
                                    }
                                } else if (j4 != 0) {
                                    throw zzbu.zza("ContentEncodingOrder " + j4 + " not supported", null);
                                }
                                gu5Var2.e = 0;
                            } else if (c != 3) {
                                j5 = gu5Var2.g;
                                if (j5 <= 2147483647L) {
                                    throw zzbu.zza("String element size: " + j5, null);
                                }
                                i8 = (int) j5;
                                if (i8 == 0) {
                                    str = "";
                                    i9 = 0;
                                } else {
                                    bArr = new byte[i8];
                                    i9 = 0;
                                    ((zzyv) zzzgVar2).zzn(bArr, 0, i8, false);
                                    while (i8 > 0) {
                                        i10 = i8 - 1;
                                        if (bArr[i10] == 0) {
                                            i8 = i10;
                                        } else {
                                            str = new String(bArr, 0, i8);
                                        }
                                    }
                                    str = new String(bArr, 0, i8);
                                }
                                zzaefVar.b(i, str);
                                gu5Var2.e = i9;
                            } else if (c != 4) {
                                j8 = gu5Var2.g;
                                if (j8 == 4 && j8 != 8) {
                                    throw zzbu.zza("Invalid float size: " + j8, null);
                                }
                                i35 = (int) j8;
                                ((zzyv) zzzgVar2).zzn(bArr2, 0, i35, false);
                                j9 = 0;
                                for (i36 = 0; i36 < i35; i36++) {
                                    j9 = ((long) (bArr2[i36] & 255)) | (j9 << 8);
                                }
                                if (i35 == 4) {
                                    dLongBitsToDouble = Float.intBitsToFloat((int) j9);
                                } else {
                                    dLongBitsToDouble = Double.longBitsToDouble(j9);
                                }
                                zzaefVar.a(dLongBitsToDouble, i);
                                z2 = false;
                                gu5Var2.e = 0;
                            } else {
                                i11 = (int) gu5Var2.g;
                                sparseArray = zzaefVar.c;
                                if (i != 161 || i == 163) {
                                    i12 = zzaefVar.G;
                                    zzedVar = zzaefVar.g;
                                    if (i12 == 0) {
                                        lu5 lu5Var3 = zzaefVar.b;
                                        zzaefVar.M = (int) lu5Var3.b(zzzgVar2, false, true, 8);
                                        zzaefVar.N = lu5Var3.c;
                                        zzaefVar.I = -9223372036854775807L;
                                        zzaefVar.G = 1;
                                        zzedVar.zzC(0);
                                    }
                                    zzaeeVar2 = (zzaee) sparseArray.get(zzaefVar.M);
                                    if (zzaeeVar2 == null) {
                                        ((zzyv) zzzgVar2).zzo(i11 - zzaefVar.N, false);
                                        zzaefVar.G = 0;
                                    } else {
                                        zzaeeVar2.zzV.getClass();
                                        if (zzaefVar.G == 1) {
                                            zzaefVar.h(zzzgVar2, 3);
                                            i16 = (zzedVar.zzH()[2] & 6) >> 1;
                                            if (i16 == 0) {
                                                zzaefVar.K = 1;
                                                iArr2 = zzaefVar.L;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[1];
                                                } else {
                                                    length2 = iArr2.length;
                                                    if (length2 < 1) {
                                                        iArr2 = new int[Math.max(length2 + length2, 1)];
                                                    }
                                                }
                                                zzaefVar.L = iArr2;
                                                iArr2[0] = (i11 - zzaefVar.N) - 3;
                                            } else {
                                                i17 = 4;
                                                zzaefVar.h(zzzgVar2, 4);
                                                i18 = (zzedVar.zzH()[3] & 255) + 1;
                                                zzaefVar.K = i18;
                                                iArr = zzaefVar.L;
                                                if (iArr == null) {
                                                    iArr = new int[i18];
                                                } else {
                                                    length = iArr.length;
                                                    if (length < i18) {
                                                        iArr = new int[Math.max(length + length, i18)];
                                                    }
                                                }
                                                zzaefVar.L = iArr;
                                                if (i16 == 2) {
                                                    int i42 = zzaefVar.N;
                                                    int i43 = zzaefVar.K;
                                                    Arrays.fill(iArr, 0, i43, ((i11 - i42) - 4) / i43);
                                                } else {
                                                    i19 = 0;
                                                    i20 = 1;
                                                    if (i16 == 1) {
                                                        i29 = 0;
                                                        i30 = 0;
                                                        while (true) {
                                                            i31 = zzaefVar.K - 1;
                                                            if (i29 < i31) {
                                                                zzaefVar.L[i29] = i19;
                                                                while (true) {
                                                                    i17 += i20;
                                                                    zzaefVar.h(zzzgVar2, i17);
                                                                    i32 = zzedVar.zzH()[i17 - 1] & 255;
                                                                    int[] iArr3 = zzaefVar.L;
                                                                    i33 = iArr3[i29] + i32;
                                                                    iArr3[i29] = i33;
                                                                    if (i32 != 255) {
                                                                        break;
                                                                    }
                                                                    i20 = 1;
                                                                }
                                                                i30 += i33;
                                                                i29++;
                                                                i19 = 0;
                                                                i20 = 1;
                                                            } else {
                                                                zzaefVar.L[i31] = ((i11 - zzaefVar.N) - i17) - i30;
                                                            }
                                                        }
                                                    } else {
                                                        if (i16 != 3) {
                                                            throw zzbu.zza("Unexpected lacing value: 2", null);
                                                        }
                                                        i21 = 0;
                                                        i22 = 0;
                                                        while (true) {
                                                            i23 = zzaefVar.K - 1;
                                                            if (i21 < i23) {
                                                                zzaefVar.L[i21] = 0;
                                                                i17++;
                                                                zzaefVar.h(zzzgVar2, i17);
                                                                i24 = i17 - 1;
                                                                if (zzedVar.zzH()[i24] == 0) {
                                                                    throw zzbu.zza("No valid varint length mask found", null);
                                                                }
                                                                i25 = 0;
                                                                while (true) {
                                                                    if (i25 < 8) {
                                                                        i26 = 1 << (7 - i25);
                                                                        if ((zzedVar.zzH()[i24] & i26) != 0) {
                                                                            i27 = i17 + i25;
                                                                            zzaefVar.h(zzzgVar2, i27);
                                                                            i28 = i24 + 1;
                                                                            int i44 = zzedVar.zzH()[i24] & 255 & (~i26);
                                                                            zzedVar3 = zzedVar;
                                                                            j7 = i44;
                                                                            while (i28 < i27) {
                                                                                j7 = (j7 << 8) | ((long) (zzedVar3.zzH()[i28] & 255));
                                                                                i28++;
                                                                                i27 = i27;
                                                                            }
                                                                            int i45 = i27;
                                                                            if (i21 > 0) {
                                                                                j6 = j7 - ((1 << ((i25 * 7) + 6)) - 1);
                                                                            } else {
                                                                                j6 = j7;
                                                                            }
                                                                            i17 = i45;
                                                                        } else {
                                                                            i25++;
                                                                            zzzgVar2 = zzzgVar;
                                                                        }
                                                                    } else {
                                                                        zzedVar3 = zzedVar;
                                                                        j6 = 0;
                                                                    }
                                                                }
                                                                if (j6 >= -2147483648L || j6 > 2147483647L) {
                                                                    throw zzbu.zza("EBML lacing sample size out of range.", null);
                                                                }
                                                                int i46 = (int) j6;
                                                                int[] iArr4 = zzaefVar.L;
                                                                if (i21 != 0) {
                                                                    i46 += iArr4[i21 - 1];
                                                                }
                                                                iArr4[i21] = i46;
                                                                i22 += i46;
                                                                i21++;
                                                                zzzgVar2 = zzzgVar;
                                                                zzedVar = zzedVar3;
                                                            } else {
                                                                zzedVar2 = zzedVar;
                                                                zzaefVar.L[i23] = ((i11 - zzaefVar.N) - i17) - i22;
                                                            }
                                                        }
                                                    }
                                                    zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                                    if (zzaeeVar2.zzd == 2) {
                                                        if (i == 163) {
                                                            i = 163;
                                                            i34 = (zzedVar2.zzH()[2] & 128) == 128 ? 1 : 0;
                                                        }
                                                    }
                                                    zzaefVar.O = i34;
                                                    zzaefVar.G = 2;
                                                    zzaefVar.J = 0;
                                                }
                                            }
                                            zzedVar2 = zzedVar;
                                            zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                            if (zzaeeVar2.zzd == 2) {
                                                if (i == 163) {
                                                    i = 163;
                                                    if ((zzedVar2.zzH()[2] & 128) == 128) {
                                                    }
                                                }
                                            }
                                            zzaefVar.O = i34;
                                            zzaefVar.G = 2;
                                            zzaefVar.J = 0;
                                        }
                                        if (i == 163) {
                                            while (true) {
                                                i14 = zzaefVar.J;
                                                if (i14 < zzaefVar.K) {
                                                    zzaefVar.g(zzaeeVar2, ((long) ((zzaefVar.J * zzaeeVar2.zze) / AdError.NETWORK_ERROR_CODE)) + zzaefVar.H, zzaefVar.O, zzaefVar.c(zzzgVar, zzaeeVar2, zzaefVar.L[i14], false), 0);
                                                    zzaefVar.J++;
                                                } else {
                                                    zzzgVar2 = zzzgVar;
                                                    i15 = 0;
                                                    zzaefVar.G = 0;
                                                    gu5Var = gu5Var2;
                                                }
                                            }
                                        } else {
                                            zzzgVar2 = zzzgVar;
                                            while (true) {
                                                i13 = zzaefVar.J;
                                                if (i13 < zzaefVar.K) {
                                                    int[] iArr5 = zzaefVar.L;
                                                    iArr5[i13] = zzaefVar.c(zzzgVar2, zzaeeVar2, iArr5[i13], true);
                                                    zzaefVar.J++;
                                                }
                                            }
                                        }
                                        gu5Var.e = i15;
                                    }
                                } else {
                                    if (i != 165) {
                                        if (i == 16877) {
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar6 = zzaefVar.u;
                                            int i47 = zzaeeVar6.a;
                                            if (i47 == 1685485123 || i47 == 1685480259) {
                                                byte[] bArr3 = new byte[i11];
                                                zzaeeVar6.zzM = bArr3;
                                                ((zzyv) zzzgVar2).zzn(bArr3, 0, i11, false);
                                            } else {
                                                ((zzyv) zzzgVar2).zzo(i11, false);
                                            }
                                        } else if (i == 16981) {
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar7 = zzaefVar.u;
                                            byte[] bArr4 = new byte[i11];
                                            zzaeeVar7.zzh = bArr4;
                                            ((zzyv) zzzgVar2).zzn(bArr4, 0, i11, false);
                                        } else if (i == 18402) {
                                            byte[] bArr5 = new byte[i11];
                                            ((zzyv) zzzgVar2).zzn(bArr5, 0, i11, false);
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzi = new zzaal(1, bArr5, 0, 0);
                                        } else if (i == 21419) {
                                            zzed zzedVar4 = zzaefVar.i;
                                            Arrays.fill(zzedVar4.zzH(), (byte) 0);
                                            ((zzyv) zzzgVar2).zzn(zzedVar4.zzH(), 4 - i11, i11, false);
                                            zzedVar4.zzF(0);
                                            zzaefVar.w = (int) zzedVar4.zzs();
                                        } else if (i == 25506) {
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar8 = zzaefVar.u;
                                            byte[] bArr6 = new byte[i11];
                                            zzaeeVar8.zzj = bArr6;
                                            ((zzyv) zzzgVar2).zzn(bArr6, 0, i11, false);
                                        } else {
                                            if (i != 30322) {
                                                throw zzbu.zza("Unexpected id: " + i, null);
                                            }
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar9 = zzaefVar.u;
                                            byte[] bArr7 = new byte[i11];
                                            zzaeeVar9.zzu = bArr7;
                                            ((zzyv) zzzgVar2).zzn(bArr7, 0, i11, false);
                                        }
                                    } else if (zzaefVar.G == 2) {
                                        zzaee zzaeeVar10 = (zzaee) sparseArray.get(zzaefVar.M);
                                        if (zzaefVar.P == 4 && "V_VP9".equals(zzaeeVar10.zzb)) {
                                            zzed zzedVar5 = zzaefVar.n;
                                            zzedVar5.zzC(i11);
                                            ((zzyv) zzzgVar2).zzn(zzedVar5.zzH(), 0, i11, false);
                                        } else {
                                            ((zzyv) zzzgVar2).zzo(i11, false);
                                        }
                                    }
                                    gu5Var2 = gu5Var2;
                                }
                                gu5Var = gu5Var2;
                                i15 = 0;
                                gu5Var.e = i15;
                            }
                            z5 = true;
                            if (z5) {
                                jZzf2 = zzzgVar.zzf();
                                zzaefVar3 = this;
                                if (zzaefVar3.y) {
                                    zzaefVar3.A = jZzf2;
                                    zzaafVar.zza = zzaefVar3.z;
                                    zzaefVar3.y = z2;
                                    return 1;
                                }
                                if (zzaefVar3.v) {
                                    j11 = zzaefVar3.A;
                                    if (j11 != -1) {
                                        zzaafVar.zza = j11;
                                        zzaefVar3.A = -1L;
                                        return 1;
                                    }
                                }
                            } else {
                                i37 = 0;
                                while (true) {
                                    sparseArray2 = this.c;
                                    if (i37 < sparseArray2.size()) {
                                        return -1;
                                    }
                                    zzaeeVar3 = (zzaee) sparseArray2.valueAt(i37);
                                    zzaeeVar3.zzV.getClass();
                                    zzaanVar = zzaeeVar3.zzS;
                                    if (zzaanVar != null) {
                                        zzaanVar.zza(zzaeeVar3.zzV, zzaeeVar3.zzi);
                                    }
                                    i37++;
                                }
                            }
                        } else {
                            ((zzyv) zzzgVar2).zzo((int) gu5Var2.g, false);
                            gu5Var2.e = 0;
                        }
                    }
                    gu5Var2.g = lu5Var.b(zzzgVar2, false, z, 8);
                    gu5Var2.e = 2;
                    zzadz zzadzVar3 = gu5Var2.d;
                    i = gu5Var2.f;
                    zzaefVar = ((ku5) zzadzVar3).a;
                    switch (i) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            c = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            c = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            c = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            c = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            c = 5;
                            break;
                        default:
                            c = 0;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            jZzf = zzzgVar.zzf();
                            arrayDeque.push(new fu5(i, gu5Var2.g + jZzf));
                            zzadz zzadzVar4 = gu5Var2.d;
                            i2 = gu5Var2.f;
                            j = gu5Var2.g;
                            zzaefVar2 = ((ku5) zzadzVar4).a;
                            zzdd.zzb(zzaefVar2.b0);
                            if (i2 != 160) {
                                z2 = false;
                                zzaefVar2.Q = false;
                                zzaefVar2.R = 0L;
                            } else if (i2 != 174) {
                                z2 = false;
                                zzaefVar2.u = new zzaee();
                            } else if (i2 != 187) {
                                if (i2 != 19899) {
                                    zzaefVar2.w = -1;
                                    zzaefVar2.x = -1L;
                                } else if (i2 != 20533) {
                                    zzaefVar2.f(i2);
                                    zzaefVar2.u.zzg = true;
                                } else if (i2 != 21968) {
                                    zzaefVar2.f(i2);
                                    zzaefVar2.u.zzw = true;
                                } else if (i2 != 408125543) {
                                    j2 = zzaefVar2.q;
                                    if (j2 == -1) {
                                    }
                                    zzaefVar2.q = jZzf;
                                    zzaefVar2.p = j;
                                } else if (i2 != 475249515) {
                                    zzaefVar2.C = new zzdv(32);
                                    zzaefVar2.D = new zzdv(32);
                                } else if (i2 == 524531317) {
                                    if (zzaefVar2.d) {
                                        zzaefVar2.b0.zzL(new zzaah(zzaefVar2.t, 0L));
                                        zzaefVar2.v = true;
                                    } else {
                                        zzaefVar2.b0.zzL(new zzaah(zzaefVar2.t, 0L));
                                        zzaefVar2.v = true;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                zzaefVar2.E = false;
                            }
                            gu5Var2.e = z2 ? 1 : 0;
                        } else if (c != 2) {
                            j3 = gu5Var2.g;
                            if (j3 <= 8) {
                                throw zzbu.zza("Invalid integer size: " + j3, null);
                            }
                            i3 = (int) j3;
                            ((zzyv) zzzgVar2).zzn(bArr2, 0, i3, false);
                            j4 = 0;
                            while (i4 < i3) {
                                j4 = (j4 << 8) | ((long) (bArr2[i4] & 255));
                            }
                            zzaefVar.getClass();
                            if (i != 20529) {
                                if (i != 20530) {
                                    switch (i) {
                                        case 131:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzd = (int) j4;
                                            break;
                                        case 136:
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar11 = zzaefVar.u;
                                            if (j4 == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            zzaeeVar11.zzU = z3;
                                            break;
                                        case 155:
                                            zzaefVar.I = zzaefVar.d(j4);
                                            break;
                                        case 159:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzN = (int) j4;
                                            break;
                                        case 176:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzl = (int) j4;
                                            break;
                                        case 179:
                                            zzaefVar.e(i);
                                            zzaefVar.C.zzc(zzaefVar.d(j4));
                                            break;
                                        case 186:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzm = (int) j4;
                                            break;
                                        case 215:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzc = (int) j4;
                                            break;
                                        case 231:
                                            zzaefVar.B = zzaefVar.d(j4);
                                            break;
                                        case 238:
                                            zzaefVar.P = (int) j4;
                                            break;
                                        case 241:
                                            if (!zzaefVar.E) {
                                                zzaefVar.e(i);
                                                zzaefVar.D.zzc(j4);
                                                zzaefVar.E = true;
                                            }
                                            break;
                                        case 251:
                                            zzaefVar.Q = true;
                                            break;
                                        case 16871:
                                            zzaefVar.f(i);
                                            zzaefVar.u.a = (int) j4;
                                            break;
                                        case 16980:
                                            if (j4 != 3) {
                                                throw zzbu.zza("ContentCompAlgo " + j4 + " not supported", null);
                                            }
                                            break;
                                        case 17029:
                                            if (j4 >= 1) {
                                            }
                                            throw zzbu.zza("DocTypeReadVersion " + j4 + " not supported", null);
                                        case 17143:
                                            if (j4 != 1) {
                                                throw zzbu.zza("EBMLReadVersion " + j4 + " not supported", null);
                                            }
                                            break;
                                        case 18401:
                                            if (j4 != 5) {
                                                throw zzbu.zza("ContentEncAlgo " + j4 + " not supported", null);
                                            }
                                            break;
                                        case 18408:
                                            if (j4 != 1) {
                                                throw zzbu.zza("AESSettingsCipherMode " + j4 + " not supported", null);
                                            }
                                            break;
                                        case 21420:
                                            zzaefVar.x = j4 + zzaefVar.q;
                                            break;
                                        case 21432:
                                            zzaefVar.f(i);
                                            i5 = (int) j4;
                                            if (i5 != 0) {
                                                zzaefVar.u.zzv = 0;
                                            } else if (i5 != 1) {
                                                zzaefVar.u.zzv = 2;
                                            } else if (i5 != 3) {
                                                zzaefVar.u.zzv = 1;
                                            } else if (i5 == 15) {
                                                zzaefVar.u.zzv = 3;
                                            }
                                            break;
                                        case 21680:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzn = (int) j4;
                                            break;
                                        case 21682:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzp = (int) j4;
                                            break;
                                        case 21690:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzo = (int) j4;
                                            break;
                                        case 21930:
                                            zzaefVar.f(i);
                                            zzaee zzaeeVar12 = zzaefVar.u;
                                            if (j4 == 1) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            zzaeeVar12.zzT = z4;
                                            break;
                                        case 21998:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzf = (int) j4;
                                            break;
                                        case 22186:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzQ = j4;
                                            break;
                                        case 22203:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzR = j4;
                                            break;
                                        case 25188:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zzO = (int) j4;
                                            break;
                                        case 30114:
                                            zzaefVar.R = j4;
                                            break;
                                        case 30321:
                                            zzaefVar.f(i);
                                            i6 = (int) j4;
                                            if (i6 != 0) {
                                                zzaefVar.u.zzq = 0;
                                            } else if (i6 != 1) {
                                                zzaefVar.u.zzq = 1;
                                            } else if (i6 != 2) {
                                                zzaefVar.u.zzq = 2;
                                            } else if (i6 == 3) {
                                                zzaefVar.u.zzq = 3;
                                            }
                                            break;
                                        case 2352003:
                                            zzaefVar.f(i);
                                            zzaefVar.u.zze = (int) j4;
                                            break;
                                        case 2807729:
                                            zzaefVar.r = j4;
                                            break;
                                        default:
                                            switch (i) {
                                                case 21945:
                                                    zzaefVar.f(i);
                                                    i7 = (int) j4;
                                                    if (i7 != 1) {
                                                        zzaefVar.u.zzz = 2;
                                                    } else if (i7 == 2) {
                                                        zzaefVar.u.zzz = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    zzaefVar.f(i);
                                                    iZzb = zzq.zzb((int) j4);
                                                    if (iZzb != -1) {
                                                        zzaefVar.u.zzy = iZzb;
                                                    }
                                                    break;
                                                case 21947:
                                                    zzaefVar.f(i);
                                                    zzaeeVar = zzaefVar.u;
                                                    zzaeeVar.zzw = true;
                                                    iZza = zzq.zza((int) j4);
                                                    if (iZza != -1) {
                                                        zzaeeVar.zzx = iZza;
                                                    }
                                                    break;
                                                case 21948:
                                                    zzaefVar.f(i);
                                                    zzaefVar.u.zzA = (int) j4;
                                                    break;
                                                case 21949:
                                                    zzaefVar.f(i);
                                                    zzaefVar.u.zzB = (int) j4;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j4 != 1) {
                                    throw zzbu.zza("ContentEncodingScope " + j4 + " not supported", null);
                                }
                            } else if (j4 != 0) {
                                throw zzbu.zza("ContentEncodingOrder " + j4 + " not supported", null);
                            }
                            gu5Var2.e = 0;
                        } else if (c != 3) {
                            j5 = gu5Var2.g;
                            if (j5 <= 2147483647L) {
                                throw zzbu.zza("String element size: " + j5, null);
                            }
                            i8 = (int) j5;
                            if (i8 == 0) {
                                str = "";
                                i9 = 0;
                            } else {
                                bArr = new byte[i8];
                                i9 = 0;
                                ((zzyv) zzzgVar2).zzn(bArr, 0, i8, false);
                                while (i8 > 0) {
                                    i10 = i8 - 1;
                                    if (bArr[i10] == 0) {
                                        i8 = i10;
                                    } else {
                                        str = new String(bArr, 0, i8);
                                    }
                                }
                                str = new String(bArr, 0, i8);
                            }
                            zzaefVar.b(i, str);
                            gu5Var2.e = i9;
                        } else if (c != 4) {
                            j8 = gu5Var2.g;
                            if (j8 == 4) {
                            }
                            i35 = (int) j8;
                            ((zzyv) zzzgVar2).zzn(bArr2, 0, i35, false);
                            j9 = 0;
                            while (i36 < i35) {
                                j9 = ((long) (bArr2[i36] & 255)) | (j9 << 8);
                            }
                            if (i35 == 4) {
                                dLongBitsToDouble = Float.intBitsToFloat((int) j9);
                            } else {
                                dLongBitsToDouble = Double.longBitsToDouble(j9);
                            }
                            zzaefVar.a(dLongBitsToDouble, i);
                            z2 = false;
                            gu5Var2.e = 0;
                        } else {
                            i11 = (int) gu5Var2.g;
                            sparseArray = zzaefVar.c;
                            if (i != 161) {
                                i12 = zzaefVar.G;
                                zzedVar = zzaefVar.g;
                                if (i12 == 0) {
                                    lu5 lu5Var4 = zzaefVar.b;
                                    zzaefVar.M = (int) lu5Var4.b(zzzgVar2, false, true, 8);
                                    zzaefVar.N = lu5Var4.c;
                                    zzaefVar.I = -9223372036854775807L;
                                    zzaefVar.G = 1;
                                    zzedVar.zzC(0);
                                }
                                zzaeeVar2 = (zzaee) sparseArray.get(zzaefVar.M);
                                if (zzaeeVar2 == null) {
                                    ((zzyv) zzzgVar2).zzo(i11 - zzaefVar.N, false);
                                    zzaefVar.G = 0;
                                } else {
                                    zzaeeVar2.zzV.getClass();
                                    if (zzaefVar.G == 1) {
                                        zzaefVar.h(zzzgVar2, 3);
                                        i16 = (zzedVar.zzH()[2] & 6) >> 1;
                                        if (i16 == 0) {
                                            zzaefVar.K = 1;
                                            iArr2 = zzaefVar.L;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            zzaefVar.L = iArr2;
                                            iArr2[0] = (i11 - zzaefVar.N) - 3;
                                        } else {
                                            i17 = 4;
                                            zzaefVar.h(zzzgVar2, 4);
                                            i18 = (zzedVar.zzH()[3] & 255) + 1;
                                            zzaefVar.K = i18;
                                            iArr = zzaefVar.L;
                                            if (iArr == null) {
                                                iArr = new int[i18];
                                            } else {
                                                length = iArr.length;
                                                if (length < i18) {
                                                    iArr = new int[Math.max(length + length, i18)];
                                                }
                                            }
                                            zzaefVar.L = iArr;
                                            if (i16 == 2) {
                                                int i48 = zzaefVar.N;
                                                int i49 = zzaefVar.K;
                                                Arrays.fill(iArr, 0, i49, ((i11 - i48) - 4) / i49);
                                            } else {
                                                i19 = 0;
                                                i20 = 1;
                                                if (i16 == 1) {
                                                    i29 = 0;
                                                    i30 = 0;
                                                    while (true) {
                                                        i31 = zzaefVar.K - 1;
                                                        if (i29 < i31) {
                                                            zzaefVar.L[i29] = i19;
                                                            while (true) {
                                                                i17 += i20;
                                                                zzaefVar.h(zzzgVar2, i17);
                                                                i32 = zzedVar.zzH()[i17 - 1] & 255;
                                                                int[] iArr6 = zzaefVar.L;
                                                                i33 = iArr6[i29] + i32;
                                                                iArr6[i29] = i33;
                                                                if (i32 != 255) {
                                                                    break;
                                                                }
                                                                i20 = 1;
                                                            }
                                                            i30 += i33;
                                                            i29++;
                                                            i19 = 0;
                                                            i20 = 1;
                                                        } else {
                                                            zzaefVar.L[i31] = ((i11 - zzaefVar.N) - i17) - i30;
                                                        }
                                                    }
                                                } else {
                                                    if (i16 != 3) {
                                                        throw zzbu.zza("Unexpected lacing value: 2", null);
                                                    }
                                                    i21 = 0;
                                                    i22 = 0;
                                                    while (true) {
                                                        i23 = zzaefVar.K - 1;
                                                        if (i21 < i23) {
                                                            zzaefVar.L[i21] = 0;
                                                            i17++;
                                                            zzaefVar.h(zzzgVar2, i17);
                                                            i24 = i17 - 1;
                                                            if (zzedVar.zzH()[i24] == 0) {
                                                                throw zzbu.zza("No valid varint length mask found", null);
                                                            }
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < 8) {
                                                                    i26 = 1 << (7 - i25);
                                                                    if ((zzedVar.zzH()[i24] & i26) != 0) {
                                                                        i27 = i17 + i25;
                                                                        zzaefVar.h(zzzgVar2, i27);
                                                                        i28 = i24 + 1;
                                                                        int i410 = zzedVar.zzH()[i24] & 255 & (~i26);
                                                                        zzedVar3 = zzedVar;
                                                                        j7 = i410;
                                                                        while (i28 < i27) {
                                                                            j7 = (j7 << 8) | ((long) (zzedVar3.zzH()[i28] & 255));
                                                                            i28++;
                                                                            i27 = i27;
                                                                        }
                                                                        int i411 = i27;
                                                                        if (i21 > 0) {
                                                                            j6 = j7 - ((1 << ((i25 * 7) + 6)) - 1);
                                                                        } else {
                                                                            j6 = j7;
                                                                        }
                                                                        i17 = i411;
                                                                    } else {
                                                                        i25++;
                                                                        zzzgVar2 = zzzgVar;
                                                                    }
                                                                } else {
                                                                    zzedVar3 = zzedVar;
                                                                    j6 = 0;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw zzbu.zza("EBML lacing sample size out of range.", null);
                                                        }
                                                        zzedVar2 = zzedVar;
                                                        zzaefVar.L[i23] = ((i11 - zzaefVar.N) - i17) - i22;
                                                        iArr4[i21] = i46;
                                                        i22 += i46;
                                                        i21++;
                                                        zzzgVar2 = zzzgVar;
                                                        zzedVar = zzedVar3;
                                                    }
                                                }
                                                zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                                if (zzaeeVar2.zzd == 2) {
                                                    if (i == 163) {
                                                        i = 163;
                                                        if ((zzedVar2.zzH()[2] & 128) == 128) {
                                                        }
                                                    }
                                                }
                                                zzaefVar.O = i34;
                                                zzaefVar.G = 2;
                                                zzaefVar.J = 0;
                                            }
                                        }
                                        zzedVar2 = zzedVar;
                                        zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                        if (zzaeeVar2.zzd == 2) {
                                            if (i == 163) {
                                                i = 163;
                                                if ((zzedVar2.zzH()[2] & 128) == 128) {
                                                }
                                            }
                                        }
                                        zzaefVar.O = i34;
                                        zzaefVar.G = 2;
                                        zzaefVar.J = 0;
                                    }
                                    if (i == 163) {
                                        while (true) {
                                            i14 = zzaefVar.J;
                                            if (i14 < zzaefVar.K) {
                                                zzaefVar.g(zzaeeVar2, ((long) ((zzaefVar.J * zzaeeVar2.zze) / AdError.NETWORK_ERROR_CODE)) + zzaefVar.H, zzaefVar.O, zzaefVar.c(zzzgVar, zzaeeVar2, zzaefVar.L[i14], false), 0);
                                                zzaefVar.J++;
                                            } else {
                                                zzzgVar2 = zzzgVar;
                                                i15 = 0;
                                                zzaefVar.G = 0;
                                                gu5Var = gu5Var2;
                                            }
                                        }
                                    } else {
                                        zzzgVar2 = zzzgVar;
                                        while (true) {
                                            i13 = zzaefVar.J;
                                            if (i13 < zzaefVar.K) {
                                                int[] iArr7 = zzaefVar.L;
                                                iArr7[i13] = zzaefVar.c(zzzgVar2, zzaeeVar2, iArr7[i13], true);
                                                zzaefVar.J++;
                                            }
                                        }
                                    }
                                }
                                gu5Var = gu5Var2;
                                i15 = 0;
                            } else {
                                i12 = zzaefVar.G;
                                zzedVar = zzaefVar.g;
                                if (i12 == 0) {
                                    lu5 lu5Var5 = zzaefVar.b;
                                    zzaefVar.M = (int) lu5Var5.b(zzzgVar2, false, true, 8);
                                    zzaefVar.N = lu5Var5.c;
                                    zzaefVar.I = -9223372036854775807L;
                                    zzaefVar.G = 1;
                                    zzedVar.zzC(0);
                                }
                                zzaeeVar2 = (zzaee) sparseArray.get(zzaefVar.M);
                                if (zzaeeVar2 == null) {
                                    ((zzyv) zzzgVar2).zzo(i11 - zzaefVar.N, false);
                                    zzaefVar.G = 0;
                                } else {
                                    zzaeeVar2.zzV.getClass();
                                    if (zzaefVar.G == 1) {
                                        zzaefVar.h(zzzgVar2, 3);
                                        i16 = (zzedVar.zzH()[2] & 6) >> 1;
                                        if (i16 == 0) {
                                            zzaefVar.K = 1;
                                            iArr2 = zzaefVar.L;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            zzaefVar.L = iArr2;
                                            iArr2[0] = (i11 - zzaefVar.N) - 3;
                                        } else {
                                            i17 = 4;
                                            zzaefVar.h(zzzgVar2, 4);
                                            i18 = (zzedVar.zzH()[3] & 255) + 1;
                                            zzaefVar.K = i18;
                                            iArr = zzaefVar.L;
                                            if (iArr == null) {
                                                iArr = new int[i18];
                                            } else {
                                                length = iArr.length;
                                                if (length < i18) {
                                                    iArr = new int[Math.max(length + length, i18)];
                                                }
                                            }
                                            zzaefVar.L = iArr;
                                            if (i16 == 2) {
                                                int i412 = zzaefVar.N;
                                                int i413 = zzaefVar.K;
                                                Arrays.fill(iArr, 0, i413, ((i11 - i412) - 4) / i413);
                                            } else {
                                                i19 = 0;
                                                i20 = 1;
                                                if (i16 == 1) {
                                                    i29 = 0;
                                                    i30 = 0;
                                                    while (true) {
                                                        i31 = zzaefVar.K - 1;
                                                        if (i29 < i31) {
                                                            zzaefVar.L[i29] = i19;
                                                            while (true) {
                                                                i17 += i20;
                                                                zzaefVar.h(zzzgVar2, i17);
                                                                i32 = zzedVar.zzH()[i17 - 1] & 255;
                                                                int[] iArr8 = zzaefVar.L;
                                                                i33 = iArr8[i29] + i32;
                                                                iArr8[i29] = i33;
                                                                if (i32 != 255) {
                                                                    break;
                                                                }
                                                                i20 = 1;
                                                            }
                                                            i30 += i33;
                                                            i29++;
                                                            i19 = 0;
                                                            i20 = 1;
                                                        } else {
                                                            zzaefVar.L[i31] = ((i11 - zzaefVar.N) - i17) - i30;
                                                        }
                                                    }
                                                } else {
                                                    if (i16 != 3) {
                                                        throw zzbu.zza("Unexpected lacing value: 2", null);
                                                    }
                                                    i21 = 0;
                                                    i22 = 0;
                                                    while (true) {
                                                        i23 = zzaefVar.K - 1;
                                                        if (i21 < i23) {
                                                            zzaefVar.L[i21] = 0;
                                                            i17++;
                                                            zzaefVar.h(zzzgVar2, i17);
                                                            i24 = i17 - 1;
                                                            if (zzedVar.zzH()[i24] == 0) {
                                                                throw zzbu.zza("No valid varint length mask found", null);
                                                            }
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < 8) {
                                                                    i26 = 1 << (7 - i25);
                                                                    if ((zzedVar.zzH()[i24] & i26) != 0) {
                                                                        i27 = i17 + i25;
                                                                        zzaefVar.h(zzzgVar2, i27);
                                                                        i28 = i24 + 1;
                                                                        int i414 = zzedVar.zzH()[i24] & 255 & (~i26);
                                                                        zzedVar3 = zzedVar;
                                                                        j7 = i414;
                                                                        while (i28 < i27) {
                                                                            j7 = (j7 << 8) | ((long) (zzedVar3.zzH()[i28] & 255));
                                                                            i28++;
                                                                            i27 = i27;
                                                                        }
                                                                        int i415 = i27;
                                                                        if (i21 > 0) {
                                                                            j6 = j7 - ((1 << ((i25 * 7) + 6)) - 1);
                                                                        } else {
                                                                            j6 = j7;
                                                                        }
                                                                        i17 = i415;
                                                                    } else {
                                                                        i25++;
                                                                        zzzgVar2 = zzzgVar;
                                                                    }
                                                                } else {
                                                                    zzedVar3 = zzedVar;
                                                                    j6 = 0;
                                                                }
                                                            }
                                                            if (j6 >= -2147483648L) {
                                                            }
                                                            throw zzbu.zza("EBML lacing sample size out of range.", null);
                                                        }
                                                        zzedVar2 = zzedVar;
                                                        zzaefVar.L[i23] = ((i11 - zzaefVar.N) - i17) - i22;
                                                        iArr4[i21] = i46;
                                                        i22 += i46;
                                                        i21++;
                                                        zzzgVar2 = zzzgVar;
                                                        zzedVar = zzedVar3;
                                                    }
                                                }
                                                zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                                if (zzaeeVar2.zzd == 2) {
                                                    if (i == 163) {
                                                        i = 163;
                                                        if ((zzedVar2.zzH()[2] & 128) == 128) {
                                                        }
                                                    }
                                                }
                                                zzaefVar.O = i34;
                                                zzaefVar.G = 2;
                                                zzaefVar.J = 0;
                                            }
                                        }
                                        zzedVar2 = zzedVar;
                                        zzaefVar.H = zzaefVar.d((zzedVar2.zzH()[0] << 8) | (zzedVar2.zzH()[1] & 255)) + zzaefVar.B;
                                        if (zzaeeVar2.zzd == 2) {
                                            if (i == 163) {
                                                i = 163;
                                                if ((zzedVar2.zzH()[2] & 128) == 128) {
                                                }
                                            }
                                        }
                                        zzaefVar.O = i34;
                                        zzaefVar.G = 2;
                                        zzaefVar.J = 0;
                                    }
                                    if (i == 163) {
                                        while (true) {
                                            i14 = zzaefVar.J;
                                            if (i14 < zzaefVar.K) {
                                                zzaefVar.g(zzaeeVar2, ((long) ((zzaefVar.J * zzaeeVar2.zze) / AdError.NETWORK_ERROR_CODE)) + zzaefVar.H, zzaefVar.O, zzaefVar.c(zzzgVar, zzaeeVar2, zzaefVar.L[i14], false), 0);
                                                zzaefVar.J++;
                                            } else {
                                                zzzgVar2 = zzzgVar;
                                                i15 = 0;
                                                zzaefVar.G = 0;
                                                gu5Var = gu5Var2;
                                            }
                                        }
                                    } else {
                                        zzzgVar2 = zzzgVar;
                                        while (true) {
                                            i13 = zzaefVar.J;
                                            if (i13 < zzaefVar.K) {
                                                int[] iArr9 = zzaefVar.L;
                                                iArr9[i13] = zzaefVar.c(zzzgVar2, zzaeeVar2, iArr9[i13], true);
                                                zzaefVar.J++;
                                            }
                                        }
                                    }
                                }
                                gu5Var = gu5Var2;
                                i15 = 0;
                            }
                            gu5Var.e = i15;
                        }
                        z5 = true;
                        if (z5) {
                            jZzf2 = zzzgVar.zzf();
                            zzaefVar3 = this;
                            if (zzaefVar3.y) {
                                zzaefVar3.A = jZzf2;
                                zzaafVar.zza = zzaefVar3.z;
                                zzaefVar3.y = z2;
                                return 1;
                            }
                            if (zzaefVar3.v) {
                                j11 = zzaefVar3.A;
                                if (j11 != -1) {
                                    zzaafVar.zza = j11;
                                    zzaefVar3.A = -1L;
                                    return 1;
                                }
                            }
                        } else {
                            i37 = 0;
                            while (true) {
                                sparseArray2 = this.c;
                                if (i37 < sparseArray2.size()) {
                                    return -1;
                                }
                                zzaeeVar3 = (zzaee) sparseArray2.valueAt(i37);
                                zzaeeVar3.zzV.getClass();
                                zzaanVar = zzaeeVar3.zzS;
                                if (zzaanVar != null) {
                                    zzaanVar.zza(zzaeeVar3.zzV, zzaeeVar3.zzi);
                                }
                                i37++;
                            }
                        }
                    } else {
                        ((zzyv) zzzgVar2).zzo((int) gu5Var2.g, false);
                        gu5Var2.e = 0;
                    }
                } else {
                    zzadz zzadzVar5 = gu5Var2.d;
                    int i50 = ((fu5) arrayDeque.pop()).a;
                    zzaef zzaefVar5 = ((ku5) zzadzVar5).a;
                    zzdd.zzb(zzaefVar5.b0);
                    SparseArray sparseArray3 = zzaefVar5.c;
                    if (i50 != 160) {
                        if (i50 == 174) {
                            zzaee zzaeeVar13 = zzaefVar5.u;
                            zzdd.zzb(zzaeeVar13);
                            String str2 = zzaeeVar13.zzb;
                            if (str2 == null) {
                                throw zzbu.zza("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str2) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    zzaeeVar13.zze(zzaefVar5.b0, zzaeeVar13.zzc);
                                    sparseArray3.put(zzaeeVar13.zzc, zzaeeVar13);
                                    break;
                            }
                            zzaefVar5.u = null;
                        } else {
                            if (i50 == 19899) {
                                int i51 = zzaefVar5.w;
                                if (i51 != -1) {
                                    long j13 = zzaefVar5.x;
                                    if (j13 != -1) {
                                        if (i51 == 475249515) {
                                            zzaefVar5.z = j13;
                                        }
                                    }
                                }
                                throw zzbu.zza("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i50 == 25152) {
                                zzaefVar5.f(i50);
                                zzaee zzaeeVar14 = zzaefVar5.u;
                                if (zzaeeVar14.zzg) {
                                    zzaal zzaalVar = zzaeeVar14.zzi;
                                    if (zzaalVar == null) {
                                        throw zzbu.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    zzaeeVar14.zzk = new zzx(null, new zzw(zzo.zza, null, "video/webm", zzaalVar.zzb));
                                }
                            } else if (i50 == 28032) {
                                zzaefVar5.f(i50);
                                zzaee zzaeeVar15 = zzaefVar5.u;
                                if (zzaeeVar15.zzg && zzaeeVar15.zzh != null) {
                                    throw zzbu.zza("Combining encryption and compression is not supported", null);
                                }
                            } else if (i50 == 357149030) {
                                if (zzaefVar5.r == -9223372036854775807L) {
                                    zzaefVar5.r = 1000000L;
                                }
                                long j14 = zzaefVar5.s;
                                if (j14 != -9223372036854775807L) {
                                    zzaefVar5.t = zzaefVar5.d(j14);
                                }
                            } else if (i50 == 374648427) {
                                if (sparseArray3.size() == 0) {
                                    throw zzbu.zza("No valid tracks were found", null);
                                }
                                zzaefVar5.b0.zzB();
                            } else if (i50 == 475249515) {
                                if (!zzaefVar5.v) {
                                    zzzi zzziVar = zzaefVar5.b0;
                                    zzdv zzdvVar = zzaefVar5.C;
                                    zzdv zzdvVar2 = zzaefVar5.D;
                                    if (zzaefVar5.q == -1 || zzaefVar5.t == -9223372036854775807L || zzdvVar == null || zzdvVar.zza() == 0 || zzdvVar2 == null || zzdvVar2.zza() != zzdvVar.zza()) {
                                        zzaahVar = new zzaah(zzaefVar5.t, 0L);
                                    } else {
                                        int iZza2 = zzdvVar.zza();
                                        int[] iArrCopyOf = new int[iZza2];
                                        long[] jArrCopyOf = new long[iZza2];
                                        long[] jArrCopyOf2 = new long[iZza2];
                                        long[] jArrCopyOf3 = new long[iZza2];
                                        for (int i52 = 0; i52 < iZza2; i52++) {
                                            jArrCopyOf3[i52] = zzdvVar.zzb(i52);
                                            jArrCopyOf[i52] = zzdvVar2.zzb(i52) + zzaefVar5.q;
                                        }
                                        int i53 = 0;
                                        while (true) {
                                            int i54 = iZza2 - 1;
                                            if (i53 < i54) {
                                                int i55 = i53 + 1;
                                                iArrCopyOf[i53] = (int) (jArrCopyOf[i55] - jArrCopyOf[i53]);
                                                jArrCopyOf2[i53] = jArrCopyOf3[i55] - jArrCopyOf3[i53];
                                                i53 = i55;
                                            } else {
                                                iArrCopyOf[i54] = (int) ((zzaefVar5.q + zzaefVar5.p) - jArrCopyOf[i54]);
                                                long j15 = zzaefVar5.t - jArrCopyOf3[i54];
                                                jArrCopyOf2[i54] = j15;
                                                if (j15 <= 0) {
                                                    Log.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j15);
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i54);
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i54);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i54);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i54);
                                                }
                                                zzaahVar = new zzyt(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    zzziVar.zzL(zzaahVar);
                                    zzaefVar5.v = true;
                                }
                                zzaefVar5.C = null;
                                zzaefVar5.D = null;
                            }
                        }
                    } else if (zzaefVar5.G == 2) {
                        zzaee zzaeeVar16 = (zzaee) sparseArray3.get(zzaefVar5.M);
                        zzaeeVar16.zzV.getClass();
                        if (zzaefVar5.R > 0 && "A_OPUS".equals(zzaeeVar16.zzb)) {
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(zzaefVar5.R).array();
                            zzaefVar5.n.zzD(bArrArray, bArrArray.length);
                        }
                        int i56 = 0;
                        for (int i57 = 0; i57 < zzaefVar5.K; i57++) {
                            i56 += zzaefVar5.L[i57];
                        }
                        int i58 = 0;
                        while (i58 < zzaefVar5.K) {
                            long j16 = zzaefVar5.H + ((long) ((zzaeeVar16.zze * i58) / AdError.NETWORK_ERROR_CODE));
                            int i59 = zzaefVar5.O;
                            if (i58 == 0) {
                                if (!zzaefVar5.Q) {
                                    i59 |= 1;
                                }
                                i38 = i59;
                                i58 = 0;
                            } else {
                                i38 = i59;
                            }
                            int i60 = zzaefVar5.L[i58];
                            i56 -= i60;
                            zzaefVar5.g(zzaeeVar16, j16, i38, i60, i56);
                            i58++;
                        }
                        zzaefVar5.G = 0;
                    }
                }
                z2 = false;
                z5 = true;
                if (z5) {
                    jZzf2 = zzzgVar.zzf();
                    zzaefVar3 = this;
                    if (zzaefVar3.y) {
                        zzaefVar3.A = jZzf2;
                        zzaafVar.zza = zzaefVar3.z;
                        zzaefVar3.y = z2;
                        return 1;
                    }
                    if (zzaefVar3.v) {
                        j11 = zzaefVar3.A;
                        if (j11 != -1) {
                            zzaafVar.zza = j11;
                            zzaefVar3.A = -1L;
                            return 1;
                        }
                    }
                } else {
                    i37 = 0;
                    while (true) {
                        sparseArray2 = this.c;
                        if (i37 < sparseArray2.size()) {
                            return -1;
                        }
                        zzaeeVar3 = (zzaee) sparseArray2.valueAt(i37);
                        zzaeeVar3.zzV.getClass();
                        zzaanVar = zzaeeVar3.zzS;
                        if (zzaanVar != null) {
                            zzaanVar.zza(zzaeeVar3.zzV, zzaeeVar3.zzi);
                        }
                        i37++;
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.b0 = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.B = -9223372036854775807L;
        int i = 0;
        this.G = 0;
        gu5 gu5Var = this.a;
        gu5Var.e = 0;
        gu5Var.b.clear();
        lu5 lu5Var = gu5Var.c;
        lu5Var.b = 0;
        lu5Var.c = 0;
        lu5 lu5Var2 = this.b;
        lu5Var2.b = 0;
        lu5Var2.c = 0;
        i();
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            zzaan zzaanVar = ((zzaee) sparseArray.valueAt(i)).zzS;
            if (zzaanVar != null) {
                zzaanVar.zzb();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        tp1 tp1Var = new tp1(3);
        long jZzd = zzzgVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        int i = (int) j;
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(((zzed) tp1Var.b).zzH(), 0, 4, false);
        tp1Var.a = 4;
        for (long jZzs = ((zzed) tp1Var.b).zzs(); jZzs != 440786851; jZzs = ((jZzs << 8) & (-256)) | ((long) (((zzed) tp1Var.b).zzH()[0] & 255))) {
            int i2 = tp1Var.a + 1;
            tp1Var.a = i2;
            if (i2 == i) {
                return false;
            }
            zzyvVar.zzm(((zzed) tp1Var.b).zzH(), 0, 1, false);
        }
        long jH = tp1Var.h(zzzgVar);
        long j2 = tp1Var.a;
        if (jH == Long.MIN_VALUE) {
            return false;
        }
        if (jZzd != -1 && j2 + jH >= jZzd) {
            return false;
        }
        while (true) {
            long j3 = tp1Var.a;
            long j4 = j2 + jH;
            if (j3 >= j4) {
                return j3 == j4;
            }
            if (tp1Var.h(zzzgVar) == Long.MIN_VALUE) {
                return false;
            }
            long jH2 = tp1Var.h(zzzgVar);
            if (jH2 < 0) {
                return false;
            }
            if (jH2 != 0) {
                int i3 = (int) jH2;
                zzyvVar.zzl(i3, false);
                tp1Var.a += i3;
            }
        }
    }

    public zzaef(int i) {
        gu5 gu5Var = new gu5();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = gu5Var;
        gu5Var.d = new ku5(this);
        this.d = true;
        this.b = new lu5();
        this.c = new SparseArray();
        this.g = new zzed(4);
        this.h = new zzed(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new zzed(4);
        this.e = new zzed(zzaac.zza);
        this.f = new zzed(4);
        this.j = new zzed();
        this.k = new zzed();
        this.l = new zzed(8);
        this.m = new zzed();
        this.n = new zzed();
        this.L = new int[1];
    }
}
