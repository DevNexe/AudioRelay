package com.google.android.gms.internal.ads;

import defpackage.jp6;
import defpackage.ko6;
import defpackage.qo6;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfux {
    public Object[] a;
    public int b;
    public qo6 c;

    public zzfux() {
        this(4);
    }

    public final zzfux zza(Object obj, Object obj2) {
        int i = this.b + 1;
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
        }
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.b = i4 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfux zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = iterable.size() + this.b;
            int i = size + size;
            Object[] objArr = this.a;
            int length = objArr.length;
            if (i > length) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    int iHighestOneBit = Integer.highestOneBit(i - 1);
                    i2 = iHighestOneBit + iHighestOneBit;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.a = Arrays.copyOf(objArr, i2);
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public final zzfuy zzc() {
        short[] sArr;
        char c;
        char c2;
        ?? r6;
        ?? r5;
        boolean z;
        ?? r7;
        jp6 jp6Var;
        qo6 qo6Var = this.c;
        if (qo6Var != null) {
            throw qo6Var.a();
        }
        int i = this.b;
        Object[] objArrCopyOf = this.a;
        if (i == 0) {
            jp6Var = jp6.C;
        } else {
            jp6 jp6Var2 = jp6.C;
            int i2 = 1;
            qo6 qo6Var2 = null;
            ?? r8 = 0;
            qo6 qo6Var3 = null;
            qo6 qo6Var4 = null;
            if (i == 1) {
                objArrCopyOf[0].getClass();
                objArrCopyOf[1].getClass();
                jp6Var = new jp6(1, null, objArrCopyOf);
            } else {
                zzfsf.zzb(i, objArrCopyOf.length >> 1, "index");
                int iF = zzfva.f(i);
                if (i == 1) {
                    objArrCopyOf[0].getClass();
                    objArrCopyOf[1].getClass();
                } else {
                    int i3 = iF - 1;
                    byte b = -1;
                    if (iF <= 128) {
                        byte[] bArr = new byte[iF];
                        Arrays.fill(bArr, (byte) -1);
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i) {
                            int i6 = i4 + i4;
                            int i7 = i5 + i5;
                            Object obj = objArrCopyOf[i6];
                            obj.getClass();
                            Object obj2 = objArrCopyOf[i6 ^ i2];
                            obj2.getClass();
                            int iG = ko6.g(obj.hashCode());
                            while (true) {
                                int i8 = iG & i3;
                                int i9 = bArr[i8] & 255;
                                if (i9 == 255) {
                                    bArr[i8] = (byte) i7;
                                    if (i5 < i4) {
                                        objArrCopyOf[i7] = obj;
                                        objArrCopyOf[i7 ^ 1] = obj2;
                                    }
                                    i5++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                                    int i10 = ~i9;
                                    Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                                    obj3.getClass();
                                    qo6Var3 = new qo6(obj, obj2, obj3);
                                    objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iG = i8 + 1;
                            }
                            i4++;
                            i2 = 1;
                        }
                        if (i5 == i) {
                            r8 = bArr;
                        } else {
                            r6 = new Object[]{bArr, Integer.valueOf(i5), qo6Var3};
                            c2 = 2;
                            c = 1;
                            r5 = r6;
                        }
                    } else if (iF <= 32768) {
                        sArr = new short[iF];
                        Arrays.fill(sArr, (short) -1);
                        int i11 = 0;
                        for (int i12 = 0; i12 < i; i12++) {
                            int i13 = i12 + i12;
                            int i14 = i11 + i11;
                            Object obj4 = objArrCopyOf[i13];
                            obj4.getClass();
                            Object obj5 = objArrCopyOf[i13 ^ 1];
                            obj5.getClass();
                            int iG2 = ko6.g(obj4.hashCode());
                            while (true) {
                                int i15 = iG2 & i3;
                                char c3 = (char) sArr[i15];
                                if (c3 == 65535) {
                                    sArr[i15] = (short) i14;
                                    if (i11 < i12) {
                                        objArrCopyOf[i14] = obj4;
                                        objArrCopyOf[i14 ^ 1] = obj5;
                                    }
                                    i11++;
                                    break;
                                }
                                if (obj4.equals(objArrCopyOf[c3])) {
                                    int i16 = c3 ^ 1;
                                    Object obj6 = objArrCopyOf[i16 == true ? 1 : 0];
                                    obj6.getClass();
                                    qo6 qo6Var5 = new qo6(obj4, obj5, obj6);
                                    objArrCopyOf[i16 == true ? 1 : 0] = obj5;
                                    qo6Var4 = qo6Var5;
                                    break;
                                }
                                iG2 = i15 + 1;
                            }
                        }
                        if (i11 != i) {
                            Integer numValueOf = Integer.valueOf(i11);
                            c = 1;
                            c2 = 2;
                            r6 = new Object[]{sArr, numValueOf, qo6Var4};
                            r5 = r6;
                        }
                        r8 = sArr;
                    } else {
                        int i17 = 1;
                        sArr = new int[iF];
                        Arrays.fill((int[]) sArr, -1);
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < i) {
                            int i20 = i18 + i18;
                            int i21 = i19 + i19;
                            Object obj7 = objArrCopyOf[i20];
                            obj7.getClass();
                            Object obj8 = objArrCopyOf[i20 ^ i17];
                            obj8.getClass();
                            int iG3 = ko6.g(obj7.hashCode());
                            while (true) {
                                int i22 = iG3 & i3;
                                ?? r15 = sArr[i22];
                                if (r15 == b) {
                                    sArr[i22] = i21;
                                    if (i19 < i18) {
                                        objArrCopyOf[i21] = obj7;
                                        objArrCopyOf[i21 ^ 1] = obj8;
                                    }
                                    i19++;
                                    break;
                                }
                                if (obj7.equals(objArrCopyOf[r15])) {
                                    int i23 = r15 ^ 1;
                                    Object obj9 = objArrCopyOf[i23 == true ? 1 : 0];
                                    obj9.getClass();
                                    qo6 qo6Var6 = new qo6(obj7, obj8, obj9);
                                    objArrCopyOf[i23 == true ? 1 : 0] = obj8;
                                    qo6Var2 = qo6Var6;
                                    break;
                                }
                                iG3 = i22 + 1;
                                b = -1;
                            }
                            i18++;
                            i17 = 1;
                            b = -1;
                        }
                        if (i19 != i) {
                            c = 1;
                            c2 = 2;
                            r6 = new Object[]{sArr, Integer.valueOf(i19), qo6Var2};
                            r5 = r6;
                        }
                        r8 = sArr;
                    }
                    z = r5 instanceof Object[];
                    r7 = r5;
                    if (z) {
                        Object[] objArr = (Object[]) r5;
                        this.c = (qo6) objArr[c2];
                        Object obj10 = objArr[0];
                        int iIntValue = ((Integer) objArr[c]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        r7 = obj10;
                        i = iIntValue;
                    }
                    jp6Var = new jp6(i, r7, objArrCopyOf);
                }
                c2 = 2;
                c = 1;
                r5 = r8;
                z = r5 instanceof Object[];
                r7 = r5;
                if (z) {
                    Object[] objArr2 = (Object[]) r5;
                    this.c = (qo6) objArr2[c2];
                    Object obj11 = objArr2[0];
                    int iIntValue2 = ((Integer) objArr2[c]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                    r7 = obj11;
                    i = iIntValue2;
                }
                jp6Var = new jp6(i, r7, objArrCopyOf);
            }
        }
        qo6 qo6Var7 = this.c;
        if (qo6Var7 == null) {
            return jp6Var;
        }
        throw qo6Var7.a();
    }

    public zzfux(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
