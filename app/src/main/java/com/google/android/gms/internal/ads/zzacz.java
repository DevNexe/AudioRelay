package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.bj0;
import defpackage.rt5;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacz {
    public static final zzacx zza = new zzacx() { // from class: com.google.android.gms.internal.ads.zzacw
    };

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int b(byte[] bArr, int i, int i2) {
        int iC = c(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iC;
        }
        while (true) {
            int length = bArr.length;
            if (iC >= length - 1) {
                return length;
            }
            if ((iC - i) % 2 == 0 && bArr[iC + 1] == 0) {
                return iC;
            }
            iC = c(iC + 1, bArr);
        }
    }

    public static int c(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int d(int i, zzed zzedVar) {
        byte[] bArrZzH = zzedVar.zzH();
        int iZzc = zzedVar.zzc();
        int i2 = iZzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzc + i) {
                return i;
            }
            if ((bArrZzH[i2] & 255) == 255 && bArrZzH[i3] == 0) {
                System.arraycopy(bArrZzH, i2 + 2, bArrZzH, i3, (i - (i2 - iZzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x029d A[Catch: UnsupportedEncodingException -> 0x0304, all -> 0x0541, TRY_ENTER, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0304, blocks: (B:131:0x022b, B:133:0x024c, B:135:0x0253, B:134:0x024f, B:153:0x0288, B:156:0x029d), top: B:265:0x0204 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd A[Catch: all -> 0x0541, UnsupportedEncodingException -> 0x054b, TryCatch #1 {all -> 0x0541, blocks: (B:245:0x051c, B:247:0x053d, B:131:0x022b, B:133:0x024c, B:135:0x0253, B:134:0x024f, B:153:0x0288, B:156:0x029d, B:158:0x02a2, B:165:0x02da, B:167:0x02f6, B:169:0x02fd, B:168:0x02f9, B:162:0x02bd, B:164:0x02d6, B:182:0x0324, B:189:0x0368, B:193:0x03a0, B:197:0x03ad, B:198:0x03b3, B:200:0x03b9, B:202:0x03c0, B:203:0x03c4, B:211:0x03ea, B:215:0x0413, B:217:0x041d, B:218:0x044e, B:219:0x045a, B:221:0x0460, B:223:0x0467, B:224:0x046b, B:228:0x0480, B:237:0x04a9, B:239:0x04e4, B:240:0x04f3, B:243:0x050a), top: B:266:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02d6 A[Catch: all -> 0x0541, UnsupportedEncodingException -> 0x054b, TryCatch #1 {all -> 0x0541, blocks: (B:245:0x051c, B:247:0x053d, B:131:0x022b, B:133:0x024c, B:135:0x0253, B:134:0x024f, B:153:0x0288, B:156:0x029d, B:158:0x02a2, B:165:0x02da, B:167:0x02f6, B:169:0x02fd, B:168:0x02f9, B:162:0x02bd, B:164:0x02d6, B:182:0x0324, B:189:0x0368, B:193:0x03a0, B:197:0x03ad, B:198:0x03b3, B:200:0x03b9, B:202:0x03c0, B:203:0x03c4, B:211:0x03ea, B:215:0x0413, B:217:0x041d, B:218:0x044e, B:219:0x045a, B:221:0x0460, B:223:0x0467, B:224:0x046b, B:228:0x0480, B:237:0x04a9, B:239:0x04e4, B:240:0x04f3, B:243:0x050a), top: B:266:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02f6 A[Catch: all -> 0x0541, UnsupportedEncodingException -> 0x054b, TryCatch #1 {all -> 0x0541, blocks: (B:245:0x051c, B:247:0x053d, B:131:0x022b, B:133:0x024c, B:135:0x0253, B:134:0x024f, B:153:0x0288, B:156:0x029d, B:158:0x02a2, B:165:0x02da, B:167:0x02f6, B:169:0x02fd, B:168:0x02f9, B:162:0x02bd, B:164:0x02d6, B:182:0x0324, B:189:0x0368, B:193:0x03a0, B:197:0x03ad, B:198:0x03b3, B:200:0x03b9, B:202:0x03c0, B:203:0x03c4, B:211:0x03ea, B:215:0x0413, B:217:0x041d, B:218:0x044e, B:219:0x045a, B:221:0x0460, B:223:0x0467, B:224:0x046b, B:228:0x0480, B:237:0x04a9, B:239:0x04e4, B:240:0x04f3, B:243:0x050a), top: B:266:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x02f9 A[Catch: all -> 0x0541, UnsupportedEncodingException -> 0x054b, TryCatch #1 {all -> 0x0541, blocks: (B:245:0x051c, B:247:0x053d, B:131:0x022b, B:133:0x024c, B:135:0x0253, B:134:0x024f, B:153:0x0288, B:156:0x029d, B:158:0x02a2, B:165:0x02da, B:167:0x02f6, B:169:0x02fd, B:168:0x02f9, B:162:0x02bd, B:164:0x02d6, B:182:0x0324, B:189:0x0368, B:193:0x03a0, B:197:0x03ad, B:198:0x03b3, B:200:0x03b9, B:202:0x03c0, B:203:0x03c4, B:211:0x03ea, B:215:0x0413, B:217:0x041d, B:218:0x044e, B:219:0x045a, B:221:0x0460, B:223:0x0467, B:224:0x046b, B:228:0x0480, B:237:0x04a9, B:239:0x04e4, B:240:0x04f3, B:243:0x050a), top: B:266:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0308  */
    /* JADX WARN: Code duplicated, block: B:183:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:229:0x0491  */
    /* JADX WARN: Code duplicated, block: B:231:0x0499  */
    /* JADX WARN: Code duplicated, block: B:233:0x049f  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:242:0x0504  */
    public static zzada e(int i, zzed zzedVar, boolean z, int i2, zzacx zzacxVar) throws Throwable {
        int iZzn;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzada zzacnVar;
        zzada zzacpVar;
        int i11;
        byte[] bArr;
        int iC;
        String strZza;
        int iA;
        byte[] bArrCopyOfRange;
        zzada zzadgVar;
        int iZzk = zzedVar.zzk();
        int iZzk2 = zzedVar.zzk();
        int iZzk3 = zzedVar.zzk();
        int iZzk4 = i >= 3 ? zzedVar.zzk() : 0;
        if (i == 4) {
            iZzn = zzedVar.zzn();
            if (!z) {
                iZzn = ((iZzn >> 24) << 21) | (iZzn & 255) | (((iZzn >> 8) & 255) << 7) | (((iZzn >> 16) & 255) << 14);
            }
        } else {
            iZzn = i == 3 ? zzedVar.zzn() : zzedVar.zzm();
        }
        int iZzo = i >= 3 ? zzedVar.zzo() : 0;
        zzada zzadaVar = null;
        if (iZzk == 0 && iZzk2 == 0 && iZzk3 == 0 && iZzk4 == 0 && iZzn == 0 && iZzo == 0) {
            zzedVar.zzF(zzedVar.zzd());
            return null;
        }
        int iZzc = zzedVar.zzc() + iZzn;
        if (iZzc > zzedVar.zzd()) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            zzedVar.zzF(zzedVar.zzd());
            return null;
        }
        if (zzacxVar != null) {
            zzedVar.zzF(iZzc);
            return null;
        }
        if (i == 3) {
            i3 = (iZzo & 128) != 0 ? 1 : 0;
            boolean z5 = (iZzo & 64) != 0;
            z2 = (iZzo & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (iZzo & 64) != 0;
            i4 = (iZzo & 8) != 0 ? 1 : 0;
            z3 = (iZzo & 4) != 0;
            z4 = (iZzo & 2) != 0;
            int i12 = iZzo & 1;
            z2 = z6;
            i3 = i12;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzedVar.zzF(iZzc);
            return null;
        }
        if (z2) {
            iZzn--;
            zzedVar.zzG(1);
        }
        if (i3 != 0) {
            iZzn -= 4;
            zzedVar.zzG(4);
        }
        if (z4) {
            iZzn = d(iZzn, zzedVar);
        }
        try {
            try {
                try {
                    try {
                        if (iZzk == 84 && iZzk2 == 88 && iZzk3 == 88 && (i == 2 || iZzk4 == 88)) {
                            if (iZzn > 0) {
                                int iZzk5 = zzedVar.zzk();
                                String strG = g(iZzk5);
                                int i13 = iZzn - 1;
                                byte[] bArr2 = new byte[i13];
                                zzedVar.zzB(bArr2, 0, i13);
                                int iB = b(bArr2, 0, iZzk5);
                                String str3 = new String(bArr2, 0, iB, strG);
                                int iA2 = iB + a(iZzk5);
                                zzadgVar = new zzadi("TXXX", str3, f(strG, bArr2, iA2, b(bArr2, iA2, iZzk5)));
                                zzadaVar = zzadgVar;
                            }
                            i6 = iZzk;
                            i10 = iZzk2;
                            i9 = iZzk3;
                            str2 = "Id3Decoder";
                            i8 = iZzk4;
                            zzacnVar = zzadaVar;
                            iZzc = iZzc;
                        } else if (iZzk == 84) {
                            String strH = h(i, 84, iZzk2, iZzk3, iZzk4);
                            if (iZzn > 0) {
                                int iZzk6 = zzedVar.zzk();
                                String strG2 = g(iZzk6);
                                int i14 = iZzn - 1;
                                byte[] bArr3 = new byte[i14];
                                zzedVar.zzB(bArr3, 0, i14);
                                zzadgVar = new zzadi(strH, null, new String(bArr3, 0, b(bArr3, 0, iZzk6), strG2));
                                zzadaVar = zzadgVar;
                            }
                            i6 = iZzk;
                            i10 = iZzk2;
                            i9 = iZzk3;
                            str2 = "Id3Decoder";
                            i8 = iZzk4;
                            zzacnVar = zzadaVar;
                            iZzc = iZzc;
                        } else {
                            if (iZzk == 87) {
                                if (iZzk2 != 88 || iZzk3 != 88 || (i != 2 && iZzk4 != 88)) {
                                    i5 = 87;
                                } else if (iZzn > 0) {
                                    int iZzk7 = zzedVar.zzk();
                                    String strG3 = g(iZzk7);
                                    int i15 = iZzn - 1;
                                    byte[] bArr4 = new byte[i15];
                                    zzedVar.zzB(bArr4, 0, i15);
                                    int iB2 = b(bArr4, 0, iZzk7);
                                    String str4 = new String(bArr4, 0, iB2, strG3);
                                    int iA3 = iB2 + a(iZzk7);
                                    zzadgVar = new zzadk("WXXX", str4, f("ISO-8859-1", bArr4, iA3, c(iA3, bArr4)));
                                    zzadaVar = zzadgVar;
                                }
                                i6 = iZzk;
                                i10 = iZzk2;
                                i9 = iZzk3;
                                str2 = "Id3Decoder";
                                i8 = iZzk4;
                                zzacnVar = zzadaVar;
                                iZzc = iZzc;
                            } else {
                                i5 = iZzk;
                            }
                            if (i5 != 87) {
                                if (i5 == 80) {
                                    if (iZzk2 == 82 && iZzk3 == 73 && iZzk4 == 86) {
                                        byte[] bArr5 = new byte[iZzn];
                                        zzedVar.zzB(bArr5, 0, iZzn);
                                        int iC2 = c(0, bArr5);
                                        String str5 = new String(bArr5, 0, iC2, "ISO-8859-1");
                                        int i16 = iC2 + 1;
                                        zzadgVar = new zzadg(str5, iZzn <= i16 ? zzel.zzf : Arrays.copyOfRange(bArr5, i16, iZzn));
                                    } else {
                                        i5 = 80;
                                    }
                                }
                                try {
                                    if (i5 == 71) {
                                        if (iZzk2 == 69 && iZzk3 == 79 && (iZzk4 == 66 || i == 2)) {
                                            int iZzk8 = zzedVar.zzk();
                                            String strG4 = g(iZzk8);
                                            int i17 = iZzn - 1;
                                            byte[] bArr6 = new byte[i17];
                                            zzedVar.zzB(bArr6, 0, i17);
                                            int iC3 = c(0, bArr6);
                                            iZzc = iZzc;
                                            String str6 = new String(bArr6, 0, iC3, "ISO-8859-1");
                                            int i18 = iC3 + 1;
                                            int iB3 = b(bArr6, i18, iZzk8);
                                            String strF = f(strG4, bArr6, i18, iB3);
                                            int iA4 = iB3 + a(iZzk8);
                                            int iB4 = b(bArr6, iA4, iZzk8);
                                            String strF2 = f(strG4, bArr6, iA4, iB4);
                                            int iA5 = iB4 + a(iZzk8);
                                            i6 = iZzk;
                                            str2 = "Id3Decoder";
                                            zzacpVar = new zzacv(str6, strF, strF2, i17 <= iA5 ? zzel.zzf : Arrays.copyOfRange(bArr6, iA5, i17));
                                        } else {
                                            i5 = 71;
                                        }
                                        zzacnVar = zzacpVar;
                                        i10 = iZzk2;
                                        i9 = iZzk3;
                                        i8 = iZzk4;
                                    }
                                    if (i != 2) {
                                        if (i5 == 65 && iZzk2 == 80 && iZzk3 == 73 && iZzk4 == 67) {
                                            int iZzk9 = zzedVar.zzk();
                                            String strG5 = g(iZzk9);
                                            i11 = iZzn - 1;
                                            bArr = new byte[i11];
                                            zzedVar.zzB(bArr, 0, i11);
                                            if (i == 2) {
                                                str2 = "Id3Decoder";
                                                strZza = "image/".concat(String.valueOf(zzfrm.zza(new String(bArr, 0, 3, "ISO-8859-1"))));
                                                if ("image/jpg".equals(strZza)) {
                                                    strZza = "image/jpeg";
                                                }
                                                iC = 2;
                                            } else {
                                                str2 = "Id3Decoder";
                                                iC = c(0, bArr);
                                                strZza = zzfrm.zza(new String(bArr, 0, iC, "ISO-8859-1"));
                                                if (strZza.indexOf(47) == -1) {
                                                    strZza = "image/".concat(strZza);
                                                }
                                            }
                                            int i19 = bArr[iC + 1] & 255;
                                            int i20 = iC + 2;
                                            int iB5 = b(bArr, i20, iZzk9);
                                            i6 = iZzk;
                                            String str7 = new String(bArr, i20, iB5 - i20, strG5);
                                            iA = iB5 + a(iZzk9);
                                            if (i11 <= iA) {
                                                bArrCopyOfRange = zzel.zzf;
                                            } else {
                                                bArrCopyOfRange = Arrays.copyOfRange(bArr, iA, i11);
                                            }
                                            zzacpVar = new zzacl(strZza, str7, i19, bArrCopyOfRange);
                                        } else {
                                            i6 = iZzk;
                                            str2 = "Id3Decoder";
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                }
                                                if (i5 != 67) {
                                                    i7 = iZzk4;
                                                    if (i5 == 77) {
                                                        i10 = iZzk2;
                                                        if (i10 == 76) {
                                                            i9 = iZzk3;
                                                            i8 = i7;
                                                            if (i9 != 76) {
                                                            }
                                                        } else {
                                                            i8 = i7;
                                                            i9 = iZzk3;
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        i9 = iZzk3;
                                                        i10 = iZzk2;
                                                    }
                                                    String strH2 = h(i, i5, i10, i9, i8);
                                                    byte[] bArr7 = new byte[iZzn];
                                                    zzedVar.zzB(bArr7, 0, iZzn);
                                                    zzacnVar = new zzacn(strH2, bArr7);
                                                } else {
                                                    i7 = iZzk4;
                                                    if (i5 == 77) {
                                                        i10 = iZzk2;
                                                        if (i10 == 76) {
                                                            i9 = iZzk3;
                                                            i8 = i7;
                                                            if (i9 != 76) {
                                                            }
                                                        } else {
                                                            i8 = i7;
                                                            i9 = iZzk3;
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        i9 = iZzk3;
                                                        i10 = iZzk2;
                                                    }
                                                    String strH3 = h(i, i5, i10, i9, i8);
                                                    byte[] bArr8 = new byte[iZzn];
                                                    zzedVar.zzB(bArr8, 0, iZzn);
                                                    zzacnVar = new zzacn(strH3, bArr8);
                                                }
                                            } else {
                                                if (i5 != 67) {
                                                }
                                                if (i5 != 67) {
                                                    i7 = iZzk4;
                                                    if (i5 == 77) {
                                                        i10 = iZzk2;
                                                        if (i10 == 76) {
                                                            i9 = iZzk3;
                                                            i8 = i7;
                                                            if (i9 != 76) {
                                                            }
                                                        } else {
                                                            i8 = i7;
                                                            i9 = iZzk3;
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        i9 = iZzk3;
                                                        i10 = iZzk2;
                                                    }
                                                    String strH4 = h(i, i5, i10, i9, i8);
                                                    byte[] bArr9 = new byte[iZzn];
                                                    zzedVar.zzB(bArr9, 0, iZzn);
                                                    zzacnVar = new zzacn(strH4, bArr9);
                                                } else {
                                                    i7 = iZzk4;
                                                    if (i5 == 77) {
                                                        i10 = iZzk2;
                                                        if (i10 == 76) {
                                                            i9 = iZzk3;
                                                            i8 = i7;
                                                            if (i9 != 76) {
                                                            }
                                                        } else {
                                                            i8 = i7;
                                                            i9 = iZzk3;
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        i9 = iZzk3;
                                                        i10 = iZzk2;
                                                    }
                                                    String strH5 = h(i, i5, i10, i9, i8);
                                                    byte[] bArr10 = new byte[iZzn];
                                                    zzedVar.zzB(bArr10, 0, iZzn);
                                                    zzacnVar = new zzacn(strH5, bArr10);
                                                }
                                            }
                                        }
                                        zzacnVar = zzacpVar;
                                        i10 = iZzk2;
                                        i9 = iZzk3;
                                        i8 = iZzk4;
                                    } else if (i5 == 80 && iZzk2 == 73 && iZzk3 == 67) {
                                        int iZzk10 = zzedVar.zzk();
                                        String strG6 = g(iZzk10);
                                        i11 = iZzn - 1;
                                        bArr = new byte[i11];
                                        zzedVar.zzB(bArr, 0, i11);
                                        if (i == 2) {
                                            str2 = "Id3Decoder";
                                            strZza = "image/".concat(String.valueOf(zzfrm.zza(new String(bArr, 0, 3, "ISO-8859-1"))));
                                            if ("image/jpg".equals(strZza)) {
                                                strZza = "image/jpeg";
                                            }
                                            iC = 2;
                                        } else {
                                            str2 = "Id3Decoder";
                                            iC = c(0, bArr);
                                            strZza = zzfrm.zza(new String(bArr, 0, iC, "ISO-8859-1"));
                                            if (strZza.indexOf(47) == -1) {
                                                strZza = "image/".concat(strZza);
                                            }
                                        }
                                        int i110 = bArr[iC + 1] & 255;
                                        int i21 = iC + 2;
                                        int iB6 = b(bArr, i21, iZzk10);
                                        i6 = iZzk;
                                        String str8 = new String(bArr, i21, iB6 - i21, strG6);
                                        iA = iB6 + a(iZzk10);
                                        if (i11 <= iA) {
                                            bArrCopyOfRange = zzel.zzf;
                                        } else {
                                            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA, i11);
                                        }
                                        zzacpVar = new zzacl(strZza, str8, i110, bArrCopyOfRange);
                                        zzacnVar = zzacpVar;
                                        i10 = iZzk2;
                                        i9 = iZzk3;
                                        i8 = iZzk4;
                                    } else {
                                        i6 = iZzk;
                                        str2 = "Id3Decoder";
                                        if (i5 != 67 && iZzk2 == 79 && iZzk3 == 77 && (iZzk4 == 77 || i == 2)) {
                                            if (iZzn < 4) {
                                                i10 = iZzk2;
                                                i9 = iZzk3;
                                                i8 = iZzk4;
                                                zzacnVar = null;
                                            } else {
                                                int iZzk11 = zzedVar.zzk();
                                                String strG7 = g(iZzk11);
                                                byte[] bArr11 = new byte[3];
                                                zzedVar.zzB(bArr11, 0, 3);
                                                String str9 = new String(bArr11, 0, 3);
                                                int i22 = iZzn - 4;
                                                byte[] bArr12 = new byte[i22];
                                                zzedVar.zzB(bArr12, 0, i22);
                                                int iB7 = b(bArr12, 0, iZzk11);
                                                String str10 = new String(bArr12, 0, iB7, strG7);
                                                int iA6 = iB7 + a(iZzk11);
                                                zzacpVar = new zzact(str9, str10, f(strG7, bArr12, iA6, b(bArr12, iA6, iZzk11)));
                                                zzacnVar = zzacpVar;
                                                i10 = iZzk2;
                                                i9 = iZzk3;
                                                i8 = iZzk4;
                                            }
                                        } else if (i5 != 67 && iZzk2 == 72 && iZzk3 == 65 && iZzk4 == 80) {
                                            int iZzc2 = zzedVar.zzc();
                                            int iC4 = c(iZzc2, zzedVar.zzH());
                                            String str11 = new String(zzedVar.zzH(), iZzc2, iC4 - iZzc2, "ISO-8859-1");
                                            zzedVar.zzF(iC4 + 1);
                                            int iZze = zzedVar.zze();
                                            int iZze2 = zzedVar.zze();
                                            long jZzs = zzedVar.zzs();
                                            long j = jZzs == 4294967295L ? -1L : jZzs;
                                            long jZzs2 = zzedVar.zzs();
                                            long j2 = jZzs2 == 4294967295L ? -1L : jZzs2;
                                            ArrayList arrayList = new ArrayList();
                                            int i23 = iZzc2 + iZzn;
                                            while (zzedVar.zzc() < i23) {
                                                zzada zzadaVarE = e(i, zzedVar, z, i2, null);
                                                if (zzadaVarE != null) {
                                                    arrayList.add(zzadaVarE);
                                                }
                                            }
                                            zzacpVar = new zzacp(str11, iZze, iZze2, j, j2, (zzada[]) arrayList.toArray(new zzada[0]));
                                            zzacnVar = zzacpVar;
                                            i10 = iZzk2;
                                            i9 = iZzk3;
                                            i8 = iZzk4;
                                        } else if (i5 != 67 && iZzk2 == 84 && iZzk3 == 79 && iZzk4 == 67) {
                                            int iZzc3 = zzedVar.zzc();
                                            int iC5 = c(iZzc3, zzedVar.zzH());
                                            String str12 = new String(zzedVar.zzH(), iZzc3, iC5 - iZzc3, "ISO-8859-1");
                                            zzedVar.zzF(iC5 + 1);
                                            int iZzk12 = zzedVar.zzk();
                                            boolean z7 = (iZzk12 & 2) != 0;
                                            int i24 = iZzk12 & 1;
                                            int iZzk13 = zzedVar.zzk();
                                            String[] strArr = new String[iZzk13];
                                            int i25 = 0;
                                            while (i25 < iZzk13) {
                                                int iZzc4 = zzedVar.zzc();
                                                int i26 = iZzk13;
                                                int iC6 = c(iZzc4, zzedVar.zzH());
                                                strArr[i25] = new String(zzedVar.zzH(), iZzc4, iC6 - iZzc4, "ISO-8859-1");
                                                zzedVar.zzF(iC6 + 1);
                                                i25++;
                                                iZzk13 = i26;
                                                iZzk4 = iZzk4;
                                                iZzk3 = iZzk3;
                                                iZzk2 = iZzk2;
                                            }
                                            int i27 = iZzk2;
                                            int i28 = iZzk3;
                                            int i29 = iZzk4;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i30 = iZzc3 + iZzn;
                                            while (zzedVar.zzc() < i30) {
                                                zzada zzadaVarE2 = e(i, zzedVar, z, i2, null);
                                                if (zzadaVarE2 != null) {
                                                    arrayList2.add(zzadaVarE2);
                                                }
                                            }
                                            zzacnVar = new zzacr(str12, z7, 1 == i24, strArr, (zzada[]) arrayList2.toArray(new zzada[0]));
                                            i8 = i29;
                                            i9 = i28;
                                            i10 = i27;
                                        } else {
                                            i7 = iZzk4;
                                            if (i5 == 77) {
                                                i10 = iZzk2;
                                                if (i10 == 76) {
                                                    i9 = iZzk3;
                                                    i8 = i7;
                                                    if (i9 != 76 && i8 == 84) {
                                                        int iZzo2 = zzedVar.zzo();
                                                        int iZzm = zzedVar.zzm();
                                                        int iZzm2 = zzedVar.zzm();
                                                        int iZzk14 = zzedVar.zzk();
                                                        int iZzk15 = zzedVar.zzk();
                                                        zzec zzecVar = new zzec();
                                                        zzecVar.zzg(zzedVar.zzH(), zzedVar.zzd());
                                                        zzecVar.zzh(zzedVar.zzc() * 8);
                                                        int i31 = ((iZzn - 10) * 8) / (iZzk14 + iZzk15);
                                                        int[] iArr = new int[i31];
                                                        int[] iArr2 = new int[i31];
                                                        for (int i32 = 0; i32 < i31; i32++) {
                                                            int iZzc5 = zzecVar.zzc(iZzk14);
                                                            int iZzc6 = zzecVar.zzc(iZzk15);
                                                            iArr[i32] = iZzc5;
                                                            iArr2[i32] = iZzc6;
                                                        }
                                                        zzacnVar = new zzade(iZzo2, iZzm, iZzm2, iArr, iArr2);
                                                    }
                                                } else {
                                                    i8 = i7;
                                                    i9 = iZzk3;
                                                }
                                            } else {
                                                i8 = i7;
                                                i9 = iZzk3;
                                                i10 = iZzk2;
                                            }
                                            String strH6 = h(i, i5, i10, i9, i8);
                                            byte[] bArr13 = new byte[iZzn];
                                            zzedVar.zzB(bArr13, 0, iZzn);
                                            zzacnVar = new zzacn(strH6, bArr13);
                                        }
                                    }
                                } catch (UnsupportedEncodingException unused) {
                                    str2 = "Id3Decoder";
                                    str = str2;
                                }
                                int i33 = iZzc;
                                Log.w(str, "Unsupported character encoding");
                                zzedVar.zzF(i33);
                                return null;
                            }
                            String strH7 = h(i, 87, iZzk2, iZzk3, iZzk4);
                            byte[] bArr14 = new byte[iZzn];
                            zzedVar.zzB(bArr14, 0, iZzn);
                            zzadgVar = new zzadk(strH7, null, new String(bArr14, 0, c(0, bArr14), "ISO-8859-1"));
                            zzadaVar = zzadgVar;
                            i6 = iZzk;
                            i10 = iZzk2;
                            i9 = iZzk3;
                            str2 = "Id3Decoder";
                            i8 = iZzk4;
                            zzacnVar = zzadaVar;
                            iZzc = iZzc;
                        }
                        if (zzacnVar == null) {
                            String str13 = "Failed to decode frame: id=" + h(i, i6, i10, i9, i8) + ", frameSize=" + iZzn;
                            str = str2;
                            try {
                                Log.w(str, str13);
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                        zzedVar.zzF(iZzc);
                        return zzacnVar;
                    } catch (UnsupportedEncodingException unused3) {
                        iZzc = iZzc;
                        str = "Id3Decoder";
                    }
                } catch (UnsupportedEncodingException unused4) {
                }
            } catch (Throwable th) {
                th = th;
                zzedVar.zzF(iZzc);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iZzc = iZzc;
            zzedVar.zzF(iZzc);
            throw th;
        }
    }

    public static String f(String str, byte[] bArr, int i, int i2) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static String g(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static String h(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static boolean i(zzed zzedVar, int i, int i2, boolean z) {
        int iZzm;
        long jZzm;
        int iZzo;
        int i3;
        int i4;
        int iZzc = zzedVar.zzc();
        while (true) {
            try {
                int i5 = 1;
                if (zzedVar.zza() < i2) {
                    zzedVar.zzF(iZzc);
                    return true;
                }
                if (i >= 3) {
                    iZzm = zzedVar.zze();
                    jZzm = zzedVar.zzs();
                    iZzo = zzedVar.zzo();
                } else {
                    iZzm = zzedVar.zzm();
                    jZzm = zzedVar.zzm();
                    iZzo = 0;
                }
                if (iZzm == 0 && jZzm == 0 && iZzo == 0) {
                    zzedVar.zzF(iZzc);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZzm) != 0) {
                        zzedVar.zzF(iZzc);
                        return false;
                    }
                    jZzm = ((jZzm >> 24) << 21) | ((255 & (jZzm >> 16)) << 14) | (jZzm & 255) | (((jZzm >> 8) & 255) << 7);
                }
                if (i == 4) {
                    i4 = (iZzo & 64) == 0 ? 0 : 1;
                    i5 = iZzo & 1;
                } else {
                    if (i == 3) {
                        i4 = (iZzo & 32) != 0 ? 1 : 0;
                        i3 = (iZzo & 128) == 0 ? i4 : 0;
                    }
                    i4 = i3;
                    i5 = 0;
                }
                if (i5 != 0) {
                    i4 += 4;
                }
                if (jZzm < i4) {
                    zzedVar.zzF(iZzc);
                    return false;
                }
                if (zzedVar.zza() < jZzm) {
                    zzedVar.zzF(iZzc);
                    return false;
                }
                zzedVar.zzG((int) jZzm);
            } catch (Throwable th) {
                zzedVar.zzF(iZzc);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc A[SYNTHETIC] */
    public static final zzbq zza(byte[] bArr, int i, zzacx zzacxVar, zzaca zzacaVar) throws Throwable {
        boolean z;
        rt5 rt5Var;
        int i2;
        int i3;
        int iD;
        zzada zzadaVarE;
        ArrayList arrayList = new ArrayList();
        zzed zzedVar = new zzed(bArr, i);
        boolean z2 = false;
        if (zzedVar.zza() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzm = zzedVar.zzm();
            if (iZzm == 4801587) {
                int iZzk = zzedVar.zzk();
                zzedVar.zzG(1);
                int iZzk2 = zzedVar.zzk();
                int iZzj = zzedVar.zzj();
                if (iZzk != 2) {
                    if (iZzk == 3) {
                        if ((iZzk2 & 64) != 0) {
                            int iZze = zzedVar.zze();
                            zzedVar.zzG(iZze);
                            iZzj -= iZze + 4;
                        }
                    } else if (iZzk == 4) {
                        if ((iZzk2 & 64) != 0) {
                            int iZzj2 = zzedVar.zzj();
                            zzedVar.zzG(iZzj2 - 4);
                            iZzj -= iZzj2;
                        }
                        if ((iZzk2 & 16) != 0) {
                            iZzj -= 10;
                        }
                    } else {
                        bj0.b("Skipped ID3 tag with unsupported majorVersion=", iZzk, "Id3Decoder");
                    }
                    if (iZzk < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    rt5Var = new rt5(iZzk, iZzj, z);
                } else if ((iZzk2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzk < 4 || (iZzk2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    rt5Var = new rt5(iZzk, iZzj, z);
                }
                if (rt5Var == null) {
                    return null;
                }
                int iZzc = zzedVar.zzc();
                i2 = rt5Var.a;
                i3 = i2 == 2 ? 6 : 10;
                iD = rt5Var.c;
                if (rt5Var.b) {
                    iD = d(iD, zzedVar);
                }
                zzedVar.zzE(iZzc + iD);
                if (!i(zzedVar, i2, i3, false)) {
                    if (i2 == 4 || !i(zzedVar, 4, i3, true)) {
                        bj0.b("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (zzedVar.zza() >= i3) {
                    zzadaVarE = e(i2, zzedVar, z2, i3, zzacxVar);
                    if (zzadaVarE != null) {
                        arrayList.add(zzadaVarE);
                    }
                }
                return new zzbq(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iZzm)))));
        }
        rt5Var = null;
        if (rt5Var == null) {
            return null;
        }
        int iZzc2 = zzedVar.zzc();
        i2 = rt5Var.a;
        if (i2 == 2) {
        }
        iD = rt5Var.c;
        if (rt5Var.b) {
            iD = d(iD, zzedVar);
        }
        zzedVar.zzE(iZzc2 + iD);
        if (!i(zzedVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            bj0.b("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        while (zzedVar.zza() >= i3) {
            zzadaVarE = e(i2, zzedVar, z2, i3, zzacxVar);
            if (zzadaVarE != null) {
                arrayList.add(zzadaVarE);
            }
        }
        return new zzbq(arrayList);
    }
}
