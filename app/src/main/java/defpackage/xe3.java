package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(lk0[] lk0VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (lk0 lk0Var : lk0VarArr) {
            length += (((((lk0Var.g * 2) + 8) - 1) & (-8)) / 8) + (lk0Var.e * 2) + b(lk0Var.a, bArr, lk0Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + lk0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ye3.c)) {
            int length2 = lk0VarArr.length;
            while (i < length2) {
                lk0 lk0Var2 = lk0VarArr[i];
                l(byteArrayOutputStream, lk0Var2, b(lk0Var2.a, bArr, lk0Var2.b));
                n(byteArrayOutputStream, lk0Var2);
                k(byteArrayOutputStream, lk0Var2);
                m(byteArrayOutputStream, lk0Var2);
                i++;
            }
        } else {
            for (lk0 lk0Var3 : lk0VarArr) {
                l(byteArrayOutputStream, lk0Var3, b(lk0Var3.a, bArr, lk0Var3.b));
            }
            int length3 = lk0VarArr.length;
            while (i < length3) {
                lk0 lk0Var4 = lk0VarArr[i];
                n(byteArrayOutputStream, lk0Var4);
                k(byteArrayOutputStream, lk0Var4);
                m(byteArrayOutputStream, lk0Var4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, byte[] bArr, String str2) {
        byte[] bArr2 = ye3.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ye3.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return i5.b(Md5A.g(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    public static int c(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw new IllegalStateException(GM.a("Unexpected flag: ", i));
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iV = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iV += XTd3.v(byteArrayInputStream);
            iArr[i2] = iV;
        }
        return iArr;
    }

    public static lk0[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, lk0[] lk0VarArr) throws IOException {
        byte[] bArr3 = ye3.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ye3.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iV = XTd3.v(fileInputStream);
            byte[] bArrT = XTd3.t(fileInputStream, (int) XTd3.u(fileInputStream, 4), (int) XTd3.u(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
            try {
                lk0[] lk0VarArrG = g(byteArrayInputStream, bArr2, iV, lk0VarArr);
                byteArrayInputStream.close();
                return lk0VarArrG;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ye3.a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iU = (int) XTd3.u(fileInputStream, 1);
        byte[] bArrT2 = XTd3.t(fileInputStream, (int) XTd3.u(fileInputStream, 4), (int) XTd3.u(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrT2);
        try {
            lk0[] lk0VarArrF = f(byteArrayInputStream2, iU, lk0VarArr);
            byteArrayInputStream2.close();
            return lk0VarArrF;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static lk0[] f(ByteArrayInputStream byteArrayInputStream, int i, lk0[] lk0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new lk0[0];
        }
        if (i != lk0VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iV = XTd3.v(byteArrayInputStream);
            iArr[i2] = XTd3.v(byteArrayInputStream);
            strArr[i2] = new String(XTd3.s(byteArrayInputStream, iV), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            lk0 lk0Var = lk0VarArr[i3];
            if (!lk0Var.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            lk0Var.e = i4;
            lk0Var.h = d(byteArrayInputStream, i4);
        }
        return lk0VarArr;
    }

    public static lk0[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, lk0[] lk0VarArr) throws IOException {
        lk0 lk0Var;
        if (byteArrayInputStream.available() == 0) {
            return new lk0[0];
        }
        if (i != lk0VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            XTd3.v(byteArrayInputStream);
            String str = new String(XTd3.s(byteArrayInputStream, XTd3.v(byteArrayInputStream)), StandardCharsets.UTF_8);
            long jU = XTd3.u(byteArrayInputStream, 4);
            int iV = XTd3.v(byteArrayInputStream);
            if (lk0VarArr.length <= 0) {
                lk0Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= lk0VarArr.length) {
                    lk0Var = null;
                    break;
                }
                if (lk0VarArr[i3].b.equals(strSubstring)) {
                    lk0Var = lk0VarArr[i3];
                    break;
                }
                i3++;
            }
            if (lk0Var == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            lk0Var.d = jU;
            int[] iArrD = d(byteArrayInputStream, iV);
            if (Arrays.equals(bArr, ye3.e)) {
                lk0Var.e = iV;
                lk0Var.h = iArrD;
            }
        }
        return lk0VarArr;
    }

    public static lk0[] h(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ye3.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iU = (int) XTd3.u(fileInputStream, 1);
        byte[] bArrT = XTd3.t(fileInputStream, (int) XTd3.u(fileInputStream, 4), (int) XTd3.u(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
        try {
            lk0[] lk0VarArrI = i(byteArrayInputStream, str, iU);
            byteArrayInputStream.close();
            return lk0VarArrI;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static lk0[] i(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new lk0[0];
        }
        lk0[] lk0VarArr = new lk0[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iV = XTd3.v(byteArrayInputStream);
            int iV2 = XTd3.v(byteArrayInputStream);
            lk0VarArr[i2] = new lk0(str, new String(XTd3.s(byteArrayInputStream, iV), StandardCharsets.UTF_8), XTd3.u(byteArrayInputStream, 4), iV2, (int) XTd3.u(byteArrayInputStream, 4), (int) XTd3.u(byteArrayInputStream, 4), new int[iV2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            lk0 lk0Var = lk0VarArr[i3];
            int iAvailable = byteArrayInputStream.available() - lk0Var.f;
            int iV3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = lk0Var.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iV3 += XTd3.v(byteArrayInputStream);
                treeMap.put(Integer.valueOf(iV3), 1);
                for (int iV4 = XTd3.v(byteArrayInputStream); iV4 > 0; iV4--) {
                    XTd3.v(byteArrayInputStream);
                    int iU = (int) XTd3.u(byteArrayInputStream, 1);
                    if (iU != 6 && iU != 7) {
                        while (iU > 0) {
                            XTd3.u(byteArrayInputStream, 1);
                            for (int iU2 = (int) XTd3.u(byteArrayInputStream, 1); iU2 > 0; iU2--) {
                                XTd3.v(byteArrayInputStream);
                            }
                            iU--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            lk0Var.h = d(byteArrayInputStream, lk0Var.e);
            int i4 = lk0Var.g;
            BitSet bitSetValueOf = BitSet.valueOf(XTd3.s(byteArrayInputStream, ((((i4 * 2) + 8) - 1) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(c(2, i5, i4)) ? 2 : 0;
                if (bitSetValueOf.get(c(4, i5, i4))) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return lk0VarArr;
    }

    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, lk0[] lk0VarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ye3.a;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ye3.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(lk0VarArr, bArr3);
                XTd3.z(byteArrayOutputStream, lk0VarArr.length, 1);
                XTd3.z(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrH = XTd3.h(bArrA);
                XTd3.z(byteArrayOutputStream, bArrH.length, 4);
                byteArrayOutputStream.write(bArrH);
                return true;
            }
            byte[] bArr4 = ye3.d;
            if (Arrays.equals(bArr, bArr4)) {
                XTd3.z(byteArrayOutputStream, lk0VarArr.length, 1);
                for (lk0 lk0Var : lk0VarArr) {
                    int size = lk0Var.i.size() * 4;
                    String strB = b(lk0Var.a, bArr4, lk0Var.b);
                    XTd3.A(byteArrayOutputStream, strB.getBytes(StandardCharsets.UTF_8).length);
                    XTd3.A(byteArrayOutputStream, lk0Var.h.length);
                    XTd3.z(byteArrayOutputStream, size, 4);
                    XTd3.z(byteArrayOutputStream, lk0Var.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(StandardCharsets.UTF_8));
                    Iterator<Integer> it = lk0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        XTd3.A(byteArrayOutputStream, it.next().intValue());
                        XTd3.A(byteArrayOutputStream, 0);
                    }
                    for (int i : lk0Var.h) {
                        XTd3.A(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = ye3.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(lk0VarArr, bArr5);
                XTd3.z(byteArrayOutputStream, lk0VarArr.length, 1);
                XTd3.z(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrH2 = XTd3.h(bArrA2);
                XTd3.z(byteArrayOutputStream, bArrH2.length, 4);
                byteArrayOutputStream.write(bArrH2);
                return true;
            }
            byte[] bArr6 = ye3.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            XTd3.A(byteArrayOutputStream, lk0VarArr.length);
            for (lk0 lk0Var2 : lk0VarArr) {
                String strB2 = b(lk0Var2.a, bArr6, lk0Var2.b);
                XTd3.A(byteArrayOutputStream, strB2.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = lk0Var2.i;
                XTd3.A(byteArrayOutputStream, treeMap.size());
                XTd3.A(byteArrayOutputStream, lk0Var2.h.length);
                XTd3.z(byteArrayOutputStream, lk0Var2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    XTd3.A(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i2 : lk0Var2.h) {
                    XTd3.A(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            XTd3.A(byteArrayOutputStream2, lk0VarArr.length);
            int i3 = 2;
            int i4 = 2;
            for (lk0 lk0Var3 : lk0VarArr) {
                XTd3.z(byteArrayOutputStream2, lk0Var3.c, 4);
                XTd3.z(byteArrayOutputStream2, lk0Var3.d, 4);
                XTd3.z(byteArrayOutputStream2, lk0Var3.g, 4);
                String strB3 = b(lk0Var3.a, bArr2, lk0Var3.b);
                int length2 = strB3.getBytes(StandardCharsets.UTF_8).length;
                XTd3.A(byteArrayOutputStream2, length2);
                i4 = i4 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream2.write(strB3.getBytes(StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i4 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            }
            to5 to5Var = new to5(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(to5Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i5 = 0;
            for (int i6 = 0; i6 < lk0VarArr.length; i6++) {
                try {
                    lk0 lk0Var4 = lk0VarArr[i6];
                    XTd3.A(byteArrayOutputStream3, i6);
                    XTd3.A(byteArrayOutputStream3, lk0Var4.e);
                    i5 = i5 + 2 + 2 + (lk0Var4.e * 2);
                    k(byteArrayOutputStream3, lk0Var4);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i5 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
            }
            to5 to5Var2 = new to5(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(to5Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < lk0VarArr.length) {
                try {
                    lk0 lk0Var5 = lk0VarArr[i7];
                    Iterator<Map.Entry<Integer, Integer>> it3 = lk0Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream5, lk0Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream6, lk0Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            XTd3.A(byteArrayOutputStream4, i7);
                            int length3 = byteArray3.length + i3 + byteArray4.length;
                            int i9 = i8 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            XTd3.z(byteArrayOutputStream4, length3, 4);
                            XTd3.A(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i8 = i9 + length3;
                            i7++;
                            arrayList3 = arrayList4;
                            i3 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i8 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray5.length);
            }
            to5 to5Var3 = new to5(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(to5Var3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            XTd3.z(byteArrayOutputStream, arrayList2.size(), 4);
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                to5 to5Var4 = (to5) arrayList2.get(i10);
                XTd3.z(byteArrayOutputStream, ex0.a(to5Var4.a), 4);
                XTd3.z(byteArrayOutputStream, size2, 4);
                boolean z = to5Var4.c;
                byte[] bArr7 = to5Var4.b;
                if (z) {
                    long length4 = bArr7.length;
                    byte[] bArrH3 = XTd3.h(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrH3);
                    XTd3.z(byteArrayOutputStream, bArrH3.length, 4);
                    XTd3.z(byteArrayOutputStream, length4, 4);
                    length = bArrH3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    XTd3.z(byteArrayOutputStream, bArr7.length, 4);
                    XTd3.z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i10++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i11));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, lk0 lk0Var) throws IOException {
        int iIntValue = 0;
        for (int i : lk0Var.h) {
            Integer numValueOf = Integer.valueOf(i);
            XTd3.A(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, lk0 lk0Var, String str) throws IOException {
        XTd3.A(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        XTd3.A(byteArrayOutputStream, lk0Var.e);
        XTd3.z(byteArrayOutputStream, lk0Var.f, 4);
        XTd3.z(byteArrayOutputStream, lk0Var.c, 4);
        XTd3.z(byteArrayOutputStream, lk0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, lk0 lk0Var) throws IOException {
        byte[] bArr = new byte[((((lk0Var.g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : lk0Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i = iIntValue2 & 2;
            int i2 = lk0Var.g;
            if (i != 0) {
                int iC = c(2, iIntValue, i2);
                int i3 = iC / 8;
                bArr[i3] = (byte) ((1 << (iC % 8)) | bArr[i3]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iC2 = c(4, iIntValue, i2);
                int i4 = iC2 / 8;
                bArr[i4] = (byte) ((1 << (iC2 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, lk0 lk0Var) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : lk0Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                XTd3.A(byteArrayOutputStream, iIntValue - i);
                XTd3.A(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
