package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioRecord;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import com.azefsw.audioconnect.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class XTd3 implements ut0, InterfaceC1641t4, v93, qf6 {
    public static ej1 w;
    public static final XTd3 x = new XTd3();
    public static final /* synthetic */ XTd3 y = new XTd3();

    public static void A(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        z(byteArrayOutputStream, i, 2);
    }

    public static my6 B(my6 my6Var) {
        if ((my6Var instanceof py6) || (my6Var instanceof oy6)) {
            return my6Var;
        }
        return my6Var instanceof Serializable ? new oy6(my6Var) : new py6(my6Var);
    }

    public static final long c(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = mh5.c;
        return jFloatToIntBits;
    }

    public static final w55 d(w55 w55Var) {
        return w55.a(w55Var, 0L, x41.B, null, 262139);
    }

    public static final Charset e(kc1 kc1Var) {
        String strA = kc1Var.a("charset");
        if (strA == null) {
            return null;
        }
        try {
            return Charset.forName(strA);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String f(int i) {
        if (i < 1000 || i >= 5000) {
            return ur1.d(Integer.valueOf(i), "Code must be in range [1000,5000): ");
        }
        boolean z = false;
        if (!(1004 <= i && i < 1007)) {
            if (1015 <= i && i < 3000) {
                z = true;
            }
            if (!z) {
                return null;
            }
        }
        return ex0.b("Code ", i, " is reserved and may not be used.");
    }

    public static final void g(gl2 gl2Var, String str, List list, List list2, sz szVar) {
        cm2 cm2Var = gl2Var.g;
        cm2Var.getClass();
        z20.QnHx qnHx = new z20.QnHx((z20) cm2Var.b(cm2.QnHx.a(z20.class)), szVar);
        qnHx.f(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vj2 vj2Var = (vj2) it.next();
            qnHx.B.put(vj2Var.a, vj2Var.b);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            qnHx.a((yk2) it2.next());
        }
        gl2Var.i.add(qnHx);
    }

    public static byte[] h(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static d32 i(View view) {
        d32 d32Var = (d32) view.getTag(R.id.view_tree_lifecycle_owner);
        if (d32Var != null) {
            return d32Var;
        }
        Object parent = view.getParent();
        while (d32Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            d32Var = (d32) view2.getTag(R.id.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return d32Var;
    }

    public static final void j(Sb1 sb1) throws Exception {
        int i = sb1.b;
        if (i != 16) {
            throw new Exception(GM.a("Invalid encoding ", i));
        }
    }

    public static ColorStateList k(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        sp3.F1 f1;
        Object obj = r80.a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        sp3.LPt8Fixed lPt8 = new sp3.LPt8Fixed(resources, theme);
        synchronized (sp3.c) {
            SparseArray<sp3.F1> sparseArray = sp3.b.get(lPt8);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (f1 = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!f1.b.equals(resources.getConfiguration()) || (!(theme == null && f1.c == 0) && (theme == null || f1.c != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = f1.a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = sp3.a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            try {
                colorStateListA = iv.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? sp3.CQf.b(resources, i, theme) : resources.getColorStateList(i);
        }
        synchronized (sp3.c) {
            WeakHashMap<sp3.LPt8Fixed, SparseArray<sp3.F1>> weakHashMap = sp3.b;
            SparseArray<sp3.F1> sparseArray2 = weakHashMap.get(lPt8);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(lPt8, sparseArray2);
            }
            sparseArray2.append(i, new sp3.F1(colorStateListA, lPt8.a.getConfiguration(), theme));
        }
        return colorStateListA;
    }

    public static Drawable l(Context context, int i) {
        return qp3.d().f(context, i);
    }

    public static final int m(Sb1 sb1) throws Exception {
        int i = sb1.c;
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new Exception(GM.a("Invalid channel ", i));
    }

    public static final int n(Sb1 sb1) throws Exception {
        int i = sb1.c;
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 12;
        }
        throw new Exception(GM.a("Invalid channel ", i));
    }

    public static final String o(byte[] bArr) {
        char[] cArr = uc0.a;
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr3 = uc0.a;
            cArr2[i] = cArr3[i2 >> 4];
            i = i3 + 1;
            cArr2[i3] = cArr3[i2 & 15];
        }
        return new String(cArr2);
    }

    public static final boolean p(y73 y73Var) {
        boolean z = false;
        if (!(y73Var instanceof y73.CQf) && !(y73Var instanceof y73.NUlFixed)) {
            z = true;
            if (!(y73Var instanceof y73.QnHx) && !(y73Var instanceof y73.LPt8Fixed) && !(y73Var instanceof y73.F1)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z;
    }

    public static final boolean q(Throwable th, fv1 fv1Var) {
        if (fv1Var.b(th)) {
            return true;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return q(cause, fv1Var);
        }
        return false;
    }

    public static final boolean r(Throwable th, List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (q(th, (fv1) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] s(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(GM.a("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] t(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long u(InputStream inputStream, int i) throws IOException {
        byte[] bArrS = s(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrS[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static int v(InputStream inputStream) {
        return (int) u(inputStream, 2);
    }

    public static void w(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void x(gg.QnHx qnHx, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = qnHx.A;
            int i2 = qnHx.B;
            int i3 = qnHx.C;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = qnHx.z;
            if (!(j != qnHx.w.x)) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (qnHx.c(j == -1 ? 0L : j + ((long) (qnHx.C - qnHx.B))) != -1);
    }

    public static final int y(fg fgVar, fg fgVar2, int i) {
        int iMin = Math.min(fgVar2.c - fgVar2.b, i);
        int i2 = fgVar.e;
        int i3 = fgVar.c;
        int i4 = i2 - i3;
        if (i4 <= iMin) {
            int i5 = fgVar.f;
            if ((i5 - i2) + i4 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i3 + iMin) - i2 > 0) {
                fgVar.e = i5;
            }
        }
        oc2.a(fgVar2.a, fgVar.a, fgVar2.b, iMin, i3);
        fgVar2.c(iMin);
        fgVar.a(iMin);
        return iMin;
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    @Override // defpackage.ut0
    public void a(Throwable th) {
    }

    @Override // defpackage.InterfaceC1641t4
    public Object b(AudioRecord audioRecord, z80 z80Var) {
        return sd5.a;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzo());
    }
}
