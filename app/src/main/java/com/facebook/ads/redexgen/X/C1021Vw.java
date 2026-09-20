package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1021Vw implements InterfaceC0562Dq {
    public static String[] A05 = {"RGyTh4SpGx69CnC3uYB0gmKqWWTNP", "iDg", "j2BD3qxwlCatqD2Ch8dsr4SydA7XKwXL", "m1LAn1cIXYa33UPzElI", "cPJKdoCFMTZnGOgvNAg6pI", "iUx5cAJ8Ufw2U1Fp6uB6P", "qd", "YeOgnvzSUR8"};
    public final int A00;
    public final /* synthetic */ C1020Vv A04;
    public final C0678Ii A03 = new C0678Ii(new byte[5]);
    public final SparseArray<InterfaceC0569Dx> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    public C1021Vw(C1020Vv c1020Vv, int i) {
        this.A04 = c1020Vv;
        this.A00 = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[LOOP:1: B:39:0x00bd->B:41:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x002d A[SYNTHETIC] */
    private C0566Du A00(C0679Ij c0679Ij, int i) {
        int iA06 = c0679Ij.A06();
        int i2 = iA06 + i;
        int descriptorTag = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c0679Ij.A06() < i2) {
            int iA0E = c0679Ij.A0E();
            int iA07 = c0679Ij.A06() + c0679Ij.A0E();
            if (iA0E == 5) {
                long jA0M = c0679Ij.A0M();
                if (jA0M == C1020Vv.A0F) {
                    descriptorTag = 129;
                } else if (jA0M == C1020Vv.A0G) {
                    descriptorTag = 135;
                } else if (jA0M == C1020Vv.A0H) {
                    descriptorTag = 36;
                }
            } else {
                String[] strArr = A05;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[5] = "0iRHlmeNaIWOYOZ0wuzrf";
                strArr2[7] = "tRWtYFFxRJJ";
                if (iA0E == 106) {
                    descriptorTag = 129;
                } else if (A05[2].charAt(6) != 'x') {
                    A05[2] = "1wLlXhx7j4gWLvUCKIdOcZbAVKCqpjoE";
                    if (iA0E == 122) {
                        descriptorTag = 135;
                    } else if (iA0E == 123) {
                        descriptorTag = 138;
                    } else if (iA0E == 10) {
                        strTrim = c0679Ij.A0S(3).trim();
                    } else if (iA0E == 89) {
                        descriptorTag = 89;
                        arrayList = new ArrayList();
                        while (c0679Ij.A06() < iA07) {
                            String strTrim2 = c0679Ij.A0S(3).trim();
                            int iA0E2 = c0679Ij.A0E();
                            byte[] bArr = new byte[4];
                            c0679Ij.A0c(bArr, 0, 4);
                            arrayList.add(new C0565Dt(strTrim2, iA0E2, bArr));
                        }
                    }
                } else {
                    String[] strArr3 = A05;
                    strArr3[5] = "yxMQjgWbjbckRLnQ6dtKu";
                    strArr3[7] = "lY9rZIuJvHs";
                    if (iA0E == 122) {
                        descriptorTag = 135;
                    } else if (iA0E == 123) {
                        descriptorTag = 138;
                    } else if (iA0E == 10) {
                        strTrim = c0679Ij.A0S(3).trim();
                    } else if (iA0E == 89) {
                        descriptorTag = 89;
                        arrayList = new ArrayList();
                        while (c0679Ij.A06() < iA07) {
                            String strTrim3 = c0679Ij.A0S(3).trim();
                            int iA0E3 = c0679Ij.A0E();
                            byte[] bArr2 = new byte[4];
                            c0679Ij.A0c(bArr2, 0, 4);
                            arrayList.add(new C0565Dt(strTrim3, iA0E3, bArr2));
                        }
                    }
                }
            }
            c0679Ij.A0Z(iA07 - c0679Ij.A06());
        }
        c0679Ij.A0Y(i2);
        return new C0566Du(descriptorTag, strTrim, arrayList, Arrays.copyOfRange(c0679Ij.A00, iA06, i2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0562Dq
    public final void A48(C0679Ij c0679Ij) {
        C0691Iv c0691Iv;
        InterfaceC0569Dx interfaceC0569DxA4P;
        if (c0679Ij.A0E() == 2) {
            if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
                c0691Iv = (C0691Iv) this.A04.A0B.get(0);
            } else {
                c0691Iv = new C0691Iv(((C0691Iv) this.A04.A0B.get(0)).A03());
                this.A04.A0B.add(c0691Iv);
            }
            c0679Ij.A0Z(2);
            int iA0I = c0679Ij.A0I();
            int i = 5;
            c0679Ij.A0Z(5);
            c0679Ij.A0a(this.A03, 2);
            int i2 = 4;
            this.A03.A08(4);
            int i3 = 12;
            int programNumber = this.A03.A04(12);
            c0679Ij.A0Z(programNumber);
            int programNumber2 = this.A04.A05;
            int programInfoLength = 21;
            if (programNumber2 == 2 && this.A04.A03 == null) {
                C0566Du c0566Du = new C0566Du(21, null, null, new byte[0]);
                C1020Vv c1020Vv = this.A04;
                c1020Vv.A03 = c1020Vv.A09.A4P(21, c0566Du);
                this.A04.A03.A8K(c0691Iv, this.A04.A02, new C0568Dw(iA0I, 21, 8192));
            }
            this.A01.clear();
            this.A02.clear();
            int iA04 = c0679Ij.A04();
            while (iA04 > 0) {
                c0679Ij.A0a(this.A03, i);
                int iA05 = this.A03.A04(8);
                this.A03.A08(3);
                int iA06 = this.A03.A04(13);
                this.A03.A08(i2);
                int iA07 = this.A03.A04(i3);
                C0566Du c0566DuA00 = A00(c0679Ij, iA07);
                if (iA05 == 6) {
                    iA05 = c0566DuA00.A00;
                }
                int esInfoLength = iA07 + 5;
                iA04 -= esInfoLength;
                int esInfoLength2 = this.A04.A05;
                int i4 = esInfoLength2 == 2 ? iA05 : iA06;
                if (!this.A04.A07.get(i4)) {
                    int trackId = this.A04.A05;
                    if (trackId == 2 && iA05 == programInfoLength) {
                        interfaceC0569DxA4P = this.A04.A03;
                    } else {
                        C1020Vv c1020Vv2 = this.A04;
                        String[] strArr = A05;
                        String str = strArr[0];
                        String str2 = strArr[1];
                        int programInfoLength2 = str.length();
                        if (programInfoLength2 == str2.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A05;
                        strArr2[5] = "uMTX0BK3hwRt9LI9TXEhN";
                        strArr2[7] = "Q6yhhKO6s7v";
                        interfaceC0569DxA4P = c1020Vv2.A09.A4P(iA05, c0566DuA00);
                    }
                    if (this.A04.A05 != 2 || iA06 < this.A02.get(i4, 8192)) {
                        SparseIntArray sparseIntArray = this.A02;
                        int programInfoLength3 = A05[4].length();
                        if (programInfoLength3 == 17) {
                            throw new RuntimeException();
                        }
                        A05[3] = "hYuW2ZxScZvjOUyRYzD";
                        sparseIntArray.put(i4, iA06);
                        this.A01.put(i4, interfaceC0569DxA4P);
                    }
                }
                i = 5;
                i2 = 4;
                i3 = 12;
                programInfoLength = 21;
            }
            int size = this.A02.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.A02.keyAt(i5);
                this.A04.A07.put(iKeyAt, true);
                InterfaceC0569Dx interfaceC0569DxValueAt = this.A01.valueAt(i5);
                if (interfaceC0569DxValueAt != null) {
                    if (interfaceC0569DxValueAt != this.A04.A03) {
                        interfaceC0569DxValueAt.A8K(c0691Iv, this.A04.A02, new C0568Dw(iA0I, iKeyAt, 8192));
                    }
                    SparseArray sparseArray = this.A04.A06;
                    int trackIdCount = this.A02.valueAt(i5);
                    sparseArray.put(trackIdCount, interfaceC0569DxValueAt);
                }
            }
            if (this.A04.A05 == 2) {
                if (!this.A04.A04) {
                    this.A04.A02.A5D();
                    this.A04.A01 = 0;
                    this.A04.A04 = true;
                    return;
                }
                return;
            }
            int i6 = 0;
            SparseArray sparseArray2 = this.A04.A06;
            int programInfoLength4 = this.A00;
            sparseArray2.remove(programInfoLength4);
            C1020Vv c1020Vv3 = this.A04;
            if (c1020Vv3.A05 != 1) {
                i6 = this.A04.A01 - 1;
            }
            c1020Vv3.A01 = i6;
            if (this.A04.A01 == 0) {
                this.A04.A02.A5D();
                this.A04.A04 = true;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0562Dq
    public final void A8K(C0691Iv c0691Iv, InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
    }
}
