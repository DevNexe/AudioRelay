package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.UtilsKt;
import defpackage.GM;
import defpackage.c16;
import defpackage.d16;
import defpackage.e16;
import defpackage.f16;
import defpackage.mw5;
import defpackage.sd6;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzavn implements zzauv {
    public zzbab A;
    public zzbab B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public byte R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public zzauw X;
    public final c16 Y;
    public final f16 a;
    public final SparseArray b;
    public final boolean c;
    public final zzbag d;
    public final zzbag e;
    public final zzbag f;
    public final zzbag g;
    public final zzbag h;
    public final zzbag i;
    public final zzbag j;
    public final zzbag k;
    public final zzbag l;
    public ByteBuffer m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public d16 s;
    public boolean t;
    public int u;
    public long v;
    public boolean w;
    public long x;
    public long y;
    public long z;
    public static final zzaux zza = new mw5(1);
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);

    public zzavn() {
        this(0);
    }

    public final void a(int i, long j) throws zzasv {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new zzasv("ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new zzasv("ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                this.s.c = (int) j;
                return;
            case 136:
                this.s.L = j == 1;
                return;
            case 155:
                this.F = c(j);
                return;
            case 159:
                this.s.G = (int) j;
                return;
            case 176:
                this.s.j = (int) j;
                return;
            case 179:
                this.A.zzc(c(j));
                return;
            case 186:
                this.s.k = (int) j;
                return;
            case 215:
                this.s.b = (int) j;
                return;
            case 231:
                this.z = c(j);
                return;
            case 241:
                if (this.C) {
                    return;
                }
                this.B.zzc(j);
                this.C = true;
                return;
            case 251:
                this.W = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new zzasv("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new zzasv("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new zzasv("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new zzasv("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new zzasv("AESSettingsCipherMode " + j + " not supported");
            case 21420:
                this.v = j + this.o;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.s.p = 0;
                    return;
                }
                if (i2 == 1) {
                    this.s.p = 2;
                    return;
                } else if (i2 == 3) {
                    this.s.p = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.s.p = 3;
                    return;
                }
            case 21680:
                this.s.l = (int) j;
                return;
            case 21682:
                this.s.n = (int) j;
                return;
            case 21690:
                this.s.m = (int) j;
                return;
            case 21930:
                this.s.M = j == 1;
                return;
            case 22186:
                this.s.J = j;
                return;
            case 22203:
                this.s.K = j;
                return;
            case 25188:
                this.s.H = (int) j;
                return;
            case 2352003:
                this.s.d = (int) j;
                return;
            case 2807729:
                this.p = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.s.t = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.s.t = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.s.s = 6;
                                return;
                            } else if (i4 == 18) {
                                this.s.s = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.s.s = 3;
                        return;
                    case 21947:
                        d16 d16Var = this.s;
                        d16Var.q = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            d16Var.r = 1;
                            return;
                        }
                        if (i5 == 9) {
                            d16Var.r = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                d16Var.r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.s.u = (int) j;
                        return;
                    case 21949:
                        this.s.v = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void b(int i, int i2, zzauu zzauuVar) throws InterruptedException, zzasv, EOFException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 16981) {
                byte[] bArr = new byte[i2];
                this.s.f = bArr;
                zzauuVar.zzh(bArr, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                zzauuVar.zzh(bArr2, 0, i2, false);
                this.s.g = new zzavd(1, bArr2);
                return;
            }
            if (i == 21419) {
                zzbag zzbagVar = this.h;
                Arrays.fill(zzbagVar.zza, (byte) 0);
                zzauuVar.zzh(zzbagVar.zza, 4 - i2, i2, false);
                zzbagVar.zzv(0);
                this.u = (int) zzbagVar.zzm();
                return;
            }
            if (i == 25506) {
                byte[] bArr3 = new byte[i2];
                this.s.h = bArr3;
                zzauuVar.zzh(bArr3, 0, i2, false);
                return;
            } else {
                if (i != 30322) {
                    throw new zzasv(GM.a("Unexpected id: ", i));
                }
                byte[] bArr4 = new byte[i2];
                this.s.o = bArr4;
                zzauuVar.zzh(bArr4, 0, i2, false);
                return;
            }
        }
        int i9 = this.D;
        int i10 = 8;
        zzbag zzbagVar2 = this.f;
        if (i9 == 0) {
            f16 f16Var = this.a;
            this.J = (int) f16Var.b(zzauuVar, false, true, 8);
            this.K = f16Var.c;
            this.F = -9223372036854775807L;
            this.D = 1;
            zzbagVar2.zzr();
        }
        d16 d16Var = (d16) this.b.get(this.J);
        if (d16Var == null) {
            zzauuVar.zzi(i2 - this.K, false);
            this.D = 0;
            return;
        }
        if (this.D == 1) {
            f(zzauuVar, 3);
            int i11 = (zzbagVar2.zza[2] & 6) >> 1;
            byte b = 255;
            if (i11 == 0) {
                this.H = 1;
                int[] iArr = this.I;
                if (iArr == null) {
                    iArr = new int[1];
                } else {
                    int length = iArr.length;
                    if (length < 1) {
                        iArr = new int[Math.max(length + length, 1)];
                    }
                }
                this.I = iArr;
                iArr[0] = (i2 - this.K) - 3;
            } else {
                if (i != 163) {
                    throw new zzasv("Lacing only supported in SimpleBlocks.");
                }
                f(zzauuVar, 4);
                int i12 = (zzbagVar2.zza[3] & 255) + 1;
                this.H = i12;
                int[] iArr2 = this.I;
                if (iArr2 == null) {
                    iArr2 = new int[i12];
                } else {
                    int length2 = iArr2.length;
                    if (length2 < i12) {
                        iArr2 = new int[Math.max(length2 + length2, i12)];
                    }
                }
                this.I = iArr2;
                if (i11 == 2) {
                    int i13 = this.K;
                    int i14 = this.H;
                    Arrays.fill(iArr2, 0, i14, ((i2 - i13) - 4) / i14);
                } else if (i11 == 1) {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 4;
                    while (true) {
                        i3 = this.H - 1;
                        if (i15 >= i3) {
                            break;
                        }
                        this.I[i15] = 0;
                        do {
                            i17++;
                            f(zzauuVar, i17);
                            i4 = zzbagVar2.zza[i17 - 1] & 255;
                            int[] iArr3 = this.I;
                            i5 = iArr3[i15] + i4;
                            iArr3[i15] = i5;
                        } while (i4 == 255);
                        i16 += i5;
                        i15++;
                    }
                    this.I[i3] = ((i2 - this.K) - i17) - i16;
                } else {
                    if (i11 != 3) {
                        throw new zzasv("Unexpected lacing value: 2");
                    }
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 4;
                    while (true) {
                        int i21 = this.H - 1;
                        if (i18 >= i21) {
                            this.I[i21] = ((i2 - this.K) - i20) - i19;
                            break;
                        }
                        this.I[i18] = i8;
                        i20++;
                        f(zzauuVar, i20);
                        int i22 = i20 - 1;
                        if (zzbagVar2.zza[i22] == 0) {
                            throw new zzasv("No valid varint length mask found");
                        }
                        int i23 = 0;
                        while (true) {
                            if (i23 >= i10) {
                                j = 0;
                                break;
                            }
                            int i24 = i7 << (7 - i23);
                            if ((zzbagVar2.zza[i22] & i24) != 0) {
                                i20 += i23;
                                f(zzauuVar, i20);
                                j = (~i24) & zzbagVar2.zza[i22] & b;
                                for (int i25 = i22 + 1; i25 < i20; i25++) {
                                    j = (j << i10) | ((long) (zzbagVar2.zza[i25] & b));
                                    i10 = 8;
                                    b = 255;
                                }
                                if (i18 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i23 * 7) + 6)) - 1;
                                break;
                            }
                            i23++;
                            i7 = 1;
                            i10 = 8;
                            b = 255;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw new zzasv("EBML lacing sample size out of range.");
                        }
                        int i26 = (int) j;
                        int[] iArr4 = this.I;
                        if (i18 != 0) {
                            i26 += iArr4[i18 - 1];
                        }
                        iArr4[i18] = i26;
                        i19 += i26;
                        i18++;
                        i7 = 1;
                        i8 = 0;
                        i10 = 8;
                        b = 255;
                    }
                }
            }
            byte[] bArr5 = zzbagVar2.zza;
            this.E = c((bArr5[1] & 255) | (bArr5[0] << 8)) + this.z;
            byte b2 = zzbagVar2.zza[2];
            int i27 = b2 & 8;
            if (d16Var.c == 2) {
                i6 = 1;
            } else {
                if (i == 163) {
                    if ((b2 & 128) == 128) {
                        i = 163;
                        i6 = 1;
                    } else {
                        i = 163;
                    }
                }
                i6 = 0;
            }
            this.L = i6 | (i27 == 8 ? Integer.MIN_VALUE : 0);
            this.D = 2;
            this.G = 0;
        }
        if (i != 163) {
            g(zzauuVar, d16Var, this.I[0]);
            return;
        }
        while (true) {
            int i28 = this.G;
            if (i28 >= this.H) {
                this.D = 0;
                return;
            } else {
                g(zzauuVar, d16Var, this.I[i28]);
                d(d16Var, this.E + ((long) ((this.G * d16Var.d) / AdError.NETWORK_ERROR_CODE)));
                this.G++;
            }
        }
    }

    public final long c(long j) throws zzasv {
        long j2 = this.p;
        if (j2 != -9223372036854775807L) {
            return zzban.zzj(j, j2, 1000L);
        }
        throw new zzasv("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void d(d16 d16Var, long j) {
        byte[] bArrZzq;
        if ("S_TEXT/UTF8".equals(d16Var.a)) {
            zzbag zzbagVar = this.j;
            byte[] bArr = zzbagVar.zza;
            long j2 = this.F;
            if (j2 == -9223372036854775807L) {
                bArrZzq = a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArrZzq = zzban.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * UtilsKt.MICROS_MULTIPLIER))) / 1000))));
            }
            System.arraycopy(bArrZzq, 0, bArr, 19, 12);
            d16Var.O.zzb(zzbagVar, zzbagVar.zzd());
            this.U = zzbagVar.zzd() + this.U;
        }
        d16Var.O.zzc(j, this.L, this.U, 0, d16Var.g);
        this.V = true;
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        this.i.zzr();
    }

    public final int e(zzauu zzauuVar, zzave zzaveVar, int i) {
        int iZzd;
        zzbag zzbagVar = this.i;
        int iZza = zzbagVar.zza();
        if (iZza > 0) {
            iZzd = Math.min(i, iZza);
            zzaveVar.zzb(zzbagVar, iZzd);
        } else {
            iZzd = zzaveVar.zzd(zzauuVar, i, false);
        }
        this.M += iZzd;
        this.U += iZzd;
        return iZzd;
    }

    public final void f(zzauu zzauuVar, int i) throws InterruptedException, EOFException {
        zzbag zzbagVar = this.f;
        if (zzbagVar.zzd() >= i) {
            return;
        }
        if (zzbagVar.zzb() < i) {
            byte[] bArr = zzbagVar.zza;
            int length = bArr.length;
            zzbagVar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i)), zzbagVar.zzd());
        }
        zzauuVar.zzh(zzbagVar.zza, zzbagVar.zzd(), i - zzbagVar.zzd(), false);
        zzbagVar.zzu(i);
    }

    public final void g(zzauu zzauuVar, d16 d16Var, int i) throws InterruptedException, zzasv, EOFException {
        int i2;
        if ("S_TEXT/UTF8".equals(d16Var.a)) {
            int i3 = i + 32;
            zzbag zzbagVar = this.j;
            if (zzbagVar.zzb() < i3) {
                zzbagVar.zza = Arrays.copyOf(Z, i3 + i);
            }
            zzauuVar.zzh(zzbagVar.zza, 32, i, false);
            zzbagVar.zzv(0);
            zzbagVar.zzu(i3);
            return;
        }
        zzave zzaveVar = d16Var.O;
        boolean z = this.N;
        zzbag zzbagVar2 = this.i;
        if (!z) {
            if (d16Var.e) {
                this.L &= -1073741825;
                boolean z2 = this.O;
                zzbag zzbagVar3 = this.f;
                if (!z2) {
                    zzauuVar.zzh(zzbagVar3.zza, 0, 1, false);
                    this.M++;
                    byte b = zzbagVar3.zza[0];
                    if ((b & 128) == 128) {
                        throw new zzasv("Extension bit is set in signal byte");
                    }
                    this.R = b;
                    this.O = true;
                }
                byte b2 = this.R;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.L |= 1073741824;
                    if (!this.P) {
                        zzbag zzbagVar4 = this.k;
                        zzauuVar.zzh(zzbagVar4.zza, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        zzbagVar3.zza[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        zzbagVar3.zzv(0);
                        zzaveVar.zzb(zzbagVar3, 1);
                        this.U++;
                        zzbagVar4.zzv(0);
                        zzaveVar.zzb(zzbagVar4, 8);
                        this.U += 8;
                    }
                    if (i4 == 2) {
                        if (!this.Q) {
                            zzauuVar.zzh(zzbagVar3.zza, 0, 1, false);
                            this.M++;
                            zzbagVar3.zzv(0);
                            this.S = zzbagVar3.zzg();
                            this.Q = true;
                        }
                        int i5 = this.S * 4;
                        zzbagVar3.zzs(i5);
                        zzauuVar.zzh(zzbagVar3.zza, 0, i5, false);
                        this.M += i5;
                        int i6 = (this.S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.m = ByteBuffer.allocate(i7);
                        }
                        this.m.position(0);
                        this.m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.S;
                            if (i8 >= i2) {
                                break;
                            }
                            int iZzi = zzbagVar3.zzi();
                            if (i8 % 2 == 0) {
                                this.m.putShort((short) (iZzi - i9));
                            } else {
                                this.m.putInt(iZzi - i9);
                            }
                            i8++;
                            i9 = iZzi;
                        }
                        int i10 = (i - this.M) - i9;
                        if ((i2 & 1) == 1) {
                            this.m.putInt(i10);
                        } else {
                            this.m.putShort((short) i10);
                            this.m.putInt(0);
                        }
                        byte[] bArrArray = this.m.array();
                        zzbag zzbagVar5 = this.l;
                        zzbagVar5.zzt(bArrArray, i7);
                        zzaveVar.zzb(zzbagVar5, i7);
                        this.U += i7;
                    }
                }
            } else {
                byte[] bArr = d16Var.f;
                if (bArr != null) {
                    zzbagVar2.zzt(bArr, bArr.length);
                }
            }
            this.N = true;
        }
        int iZzd = zzbagVar2.zzd() + i;
        if (!"V_MPEG4/ISO/AVC".equals(d16Var.a) && !"V_MPEGH/ISO/HEVC".equals(d16Var.a)) {
            while (true) {
                int i11 = this.M;
                if (i11 >= iZzd) {
                    break;
                } else {
                    e(zzauuVar, zzaveVar, iZzd - i11);
                }
            }
        } else {
            zzbag zzbagVar6 = this.e;
            byte[] bArr2 = zzbagVar6.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i12 = d16Var.P;
            int i13 = 4 - i12;
            while (this.M < iZzd) {
                int i14 = this.T;
                if (i14 == 0) {
                    int iMin = Math.min(i12, zzbagVar2.zza());
                    zzauuVar.zzh(bArr2, i13 + iMin, i12 - iMin, false);
                    if (iMin > 0) {
                        zzbagVar2.zzq(bArr2, i13, iMin);
                    }
                    this.M += i12;
                    zzbagVar6.zzv(0);
                    this.T = zzbagVar6.zzi();
                    zzbag zzbagVar7 = this.d;
                    zzbagVar7.zzv(0);
                    zzaveVar.zzb(zzbagVar7, 4);
                    this.U += 4;
                } else {
                    this.T = i14 - e(zzauuVar, zzaveVar, i14);
                }
            }
        }
        if ("A_VORBIS".equals(d16Var.a)) {
            zzbag zzbagVar8 = this.g;
            zzbagVar8.zzv(0);
            zzaveVar.zzb(zzbagVar8, 4);
            this.U += 4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzd(zzauw zzauwVar) {
        this.X = zzauwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zze(long j, long j2) {
        this.z = -9223372036854775807L;
        this.D = 0;
        c16 c16Var = this.Y;
        c16Var.d = 0;
        c16Var.b.clear();
        f16 f16Var = c16Var.c;
        f16Var.b = 0;
        f16Var.c = 0;
        f16 f16Var2 = this.a;
        f16Var2.b = 0;
        f16Var2.c = 0;
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        this.i.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final int zzf(zzauu zzauuVar, zzava zzavaVar) {
        this.V = false;
        while (!this.V) {
            if (!this.Y.a(zzauuVar)) {
                return -1;
            }
            long jZzd = zzauuVar.zzd();
            if (this.w) {
                this.y = jZzd;
                zzavaVar.zza = this.x;
                this.w = false;
                return 1;
            }
            if (this.t) {
                long j = this.y;
                if (j != -1) {
                    zzavaVar.zza = j;
                    this.y = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final boolean zzg(zzauu zzauuVar) throws InterruptedException, EOFException {
        e16 e16Var = new e16();
        long jZzc = zzauuVar.zzc();
        long j = 1024;
        if (jZzc != -1 && jZzc <= 1024) {
            j = jZzc;
        }
        int i = (int) j;
        zzbag zzbagVar = (zzbag) e16Var.x;
        zzauuVar.zzg(zzbagVar.zza, 0, 4, false);
        e16Var.w = 4;
        for (long jZzm = zzbagVar.zzm(); jZzm != 440786851; jZzm = ((jZzm << 8) & (-256)) | ((long) (zzbagVar.zza[0] & 255))) {
            int i2 = e16Var.w + 1;
            e16Var.w = i2;
            if (i2 == i) {
                return false;
            }
            zzauuVar.zzg(zzbagVar.zza, 0, 1, false);
        }
        long jA = e16Var.a(zzauuVar);
        long j2 = e16Var.w;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (jZzc != -1 && j2 + jA >= jZzc) {
            return false;
        }
        while (true) {
            long j3 = e16Var.w;
            long j4 = j2 + jA;
            if (j3 >= j4) {
                return j3 == j4;
            }
            if (e16Var.a(zzauuVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = e16Var.a(zzauuVar);
            if (jA2 < 0) {
                return false;
            }
            if (jA2 != 0) {
                zzauuVar.zzf((int) jA2, false);
                e16Var.w = (int) (((long) e16Var.w) + jA2);
            }
        }
    }

    public zzavn(int i) {
        c16 c16Var = new c16();
        this.o = -1L;
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.x = -1L;
        this.y = -1L;
        this.z = -9223372036854775807L;
        this.Y = c16Var;
        c16Var.g = new sd6(this);
        this.c = true;
        this.a = new f16();
        this.b = new SparseArray();
        this.f = new zzbag(4);
        this.g = new zzbag(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new zzbag(4);
        this.d = new zzbag(zzbae.zza);
        this.e = new zzbag(4);
        this.i = new zzbag();
        this.j = new zzbag();
        this.k = new zzbag(8);
        this.l = new zzbag();
    }
}
