package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyg {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ int zza = 0;

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return a((b2 & 192) >> 6, b2 & 63);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    public static zzaf zzc(zzed zzedVar, String str, String str2, zzx zzxVar) {
        int i = b[(zzedVar.zzk() & 192) >> 6];
        int iZzk = zzedVar.zzk();
        int i2 = d[(iZzk & 56) >> 3];
        if ((iZzk & 4) != 0) {
            i2++;
        }
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS("audio/ac3");
        zzadVar.zzw(i2);
        zzadVar.zzT(i);
        zzadVar.zzB(zzxVar);
        zzadVar.zzK(str2);
        return zzadVar.zzY();
    }

    public static zzaf zzd(zzed zzedVar, String str, String str2, zzx zzxVar) {
        zzedVar.zzG(2);
        int i = b[(zzedVar.zzk() & 192) >> 6];
        int iZzk = zzedVar.zzk();
        int i2 = d[(iZzk & 14) >> 1];
        if ((iZzk & 1) != 0) {
            i2++;
        }
        if (((zzedVar.zzk() & 30) >> 1) > 0 && (2 & zzedVar.zzk()) != 0) {
            i2 += 2;
        }
        String str3 = (zzedVar.zza() <= 0 || (zzedVar.zzk() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS(str3);
        zzadVar.zzw(i2);
        zzadVar.zzT(i);
        zzadVar.zzB(zzxVar);
        zzadVar.zzK(str2);
        return zzadVar.zzY();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bf  */
    public static zzyf zze(zzec zzecVar) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int iZzc;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iZzb = zzecVar.zzb();
        zzecVar.zzj(40);
        int iZzc2 = zzecVar.zzc(5);
        zzecVar.zzh(iZzb);
        int[] iArr = d;
        int[] iArr2 = b;
        int i14 = -1;
        if (iZzc2 > 10) {
            zzecVar.zzj(16);
            int iZzc3 = zzecVar.zzc(2);
            if (iZzc3 == 0) {
                i14 = 0;
            } else if (iZzc3 == 1) {
                i14 = 1;
            } else if (iZzc3 == 2) {
                i14 = 2;
            }
            zzecVar.zzj(3);
            int iZzc4 = zzecVar.zzc(11) + 1;
            int i15 = iZzc4 + iZzc4;
            int iZzc5 = zzecVar.zzc(2);
            if (iZzc5 == 3) {
                i5 = c[zzecVar.zzc(2)];
                i6 = 6;
                iZzc = 3;
            } else {
                iZzc = zzecVar.zzc(2);
                int i16 = a[iZzc];
                i5 = iArr2[iZzc5];
                i6 = i16;
            }
            int i17 = i6 * 256;
            int iZzc6 = zzecVar.zzc(3);
            boolean zZzl = zzecVar.zzl();
            int i18 = iArr[iZzc6] + (zZzl ? 1 : 0);
            zzecVar.zzj(10);
            if (zzecVar.zzl()) {
                zzecVar.zzj(8);
            }
            if (iZzc6 == 0) {
                zzecVar.zzj(5);
                if (zzecVar.zzl()) {
                    zzecVar.zzj(8);
                }
                i7 = 0;
                iZzc6 = 0;
            } else {
                i7 = iZzc6;
            }
            if (i14 == 1) {
                if (zzecVar.zzl()) {
                    zzecVar.zzj(16);
                }
                i14 = 1;
            }
            if (zzecVar.zzl()) {
                if (i7 > 2) {
                    zzecVar.zzj(2);
                }
                if ((i7 & 1) == 0 || i7 <= 2) {
                    i12 = 6;
                } else {
                    i12 = 6;
                    zzecVar.zzj(6);
                }
                if ((i7 & 4) != 0) {
                    zzecVar.zzj(i12);
                }
                if (zZzl && zzecVar.zzl()) {
                    zzecVar.zzj(5);
                }
                if (i14 == 0) {
                    if (zzecVar.zzl()) {
                        i13 = 6;
                        zzecVar.zzj(6);
                    } else {
                        i13 = 6;
                    }
                    if (i7 == 0 && zzecVar.zzl()) {
                        zzecVar.zzj(i13);
                    }
                    if (zzecVar.zzl()) {
                        zzecVar.zzj(i13);
                    }
                    int iZzc7 = zzecVar.zzc(2);
                    if (iZzc7 == 1) {
                        zzecVar.zzj(5);
                    } else if (iZzc7 == 2) {
                        zzecVar.zzj(12);
                    } else if (iZzc7 == 3) {
                        int iZzc8 = zzecVar.zzc(5);
                        if (zzecVar.zzl()) {
                            zzecVar.zzj(5);
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(4);
                            }
                            if (zzecVar.zzl()) {
                                if (zzecVar.zzl()) {
                                    zzecVar.zzj(4);
                                }
                                if (zzecVar.zzl()) {
                                    zzecVar.zzj(4);
                                }
                            }
                        }
                        if (zzecVar.zzl()) {
                            zzecVar.zzj(5);
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(7);
                                if (zzecVar.zzl()) {
                                    zzecVar.zzj(8);
                                }
                            }
                        }
                        zzecVar.zzj((iZzc8 + 2) * 8);
                        zzecVar.zzd();
                    }
                    if (i7 < 2) {
                        if (zzecVar.zzl()) {
                            zzecVar.zzj(14);
                        }
                        if (iZzc6 == 0 && zzecVar.zzl()) {
                            zzecVar.zzj(14);
                        }
                    }
                    if (!zzecVar.zzl()) {
                        i8 = 0;
                    } else if (iZzc == 0) {
                        zzecVar.zzj(5);
                        i8 = 0;
                        iZzc = 0;
                    } else {
                        for (int i19 = 0; i19 < i6; i19++) {
                            if (zzecVar.zzl()) {
                                zzecVar.zzj(5);
                            }
                        }
                        i8 = 0;
                    }
                } else {
                    i8 = i14;
                }
            } else {
                i8 = i14;
            }
            if (zzecVar.zzl()) {
                zzecVar.zzj(5);
                if (i7 == 2) {
                    zzecVar.zzj(4);
                    i10 = 6;
                    i7 = 2;
                } else {
                    i10 = 6;
                }
                if (i7 >= i10) {
                    zzecVar.zzj(2);
                }
                if (zzecVar.zzl()) {
                    i11 = 8;
                    zzecVar.zzj(8);
                } else {
                    i11 = 8;
                }
                if (i7 == 0 && zzecVar.zzl()) {
                    zzecVar.zzj(i11);
                }
                if (iZzc5 < 3) {
                    zzecVar.zzi();
                }
            }
            if (i8 == 0 && iZzc != 3) {
                zzecVar.zzi();
            }
            if (i8 == 2 && (iZzc == 3 || zzecVar.zzl())) {
                i9 = 6;
                zzecVar.zzj(6);
            } else {
                i9 = 6;
            }
            str = (zzecVar.zzl() && zzecVar.zzc(i9) == 1 && zzecVar.zzc(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i = i18;
            i2 = i5;
            i4 = i17;
            i3 = i15;
        } else {
            zzecVar.zzj(32);
            int iZzc9 = zzecVar.zzc(2);
            String str2 = iZzc9 == 3 ? null : "audio/ac3";
            int iA = a(iZzc9, zzecVar.zzc(6));
            zzecVar.zzj(8);
            int iZzc10 = zzecVar.zzc(3);
            if ((iZzc10 & 1) != 0 && iZzc10 != 1) {
                zzecVar.zzj(2);
            }
            if ((iZzc10 & 4) != 0) {
                zzecVar.zzj(2);
            }
            if (iZzc10 == 2) {
                zzecVar.zzj(2);
            }
            i14 = iZzc9 < 3 ? iArr2[iZzc9] : -1;
            i = iArr[iZzc10] + (zzecVar.zzl() ? 1 : 0);
            str = str2;
            i2 = i14;
            i3 = iA;
            i4 = 1536;
        }
        return new zzyf(str, i, i2, i3, i4);
    }
}
