package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.azefsw.audioconnect.R;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.serialization.ContentConvertException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X€, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class X implements d41.QnHx, u53, qf6 {
    public static ej1 w;
    public static final /* synthetic */ X x = new X();

    public static void A(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    public static final boolean B(rk3 rk3Var, rk3 rk3Var2) {
        boolean z;
        if (rk3Var == null) {
            return true;
        }
        if ((rk3Var instanceof tk3) && (rk3Var2 instanceof tk3)) {
            tk3 tk3Var = (tk3) rk3Var;
            if (tk3Var.b == null) {
                z = false;
            } else {
                Z1 z1 = tk3Var.c;
                if (z1 != null ? z1.a() : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z || ur1.a(rk3Var, rk3Var2) || ur1.a(tk3Var.c, ((tk3) rk3Var2).c)) {
                return true;
            }
        }
        return false;
    }

    public static void C(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    public static final void D(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    public static final Serializable E(fk fkVar, z80 z80Var) throws Throwable {
        ak akVar;
        if (z80Var instanceof ak) {
            akVar = (ak) z80Var;
            int i = akVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                akVar.A = i - Integer.MIN_VALUE;
            } else {
                akVar = new ak(z80Var);
            }
        } else {
            akVar = new ak(z80Var);
        }
        Object objP = akVar.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = akVar.A;
        if (i2 == 0) {
            C0239D.H(objP);
            akVar.A = 1;
            objP = fkVar.p(Long.MAX_VALUE, akVar);
            if (objP == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objP);
        }
        return ac.h((hk) objP);
    }

    public static final char F(char c) {
        if ('A' <= c && c < '[') {
            return (char) (c + ' ');
        }
        return c >= 0 && c < 128 ? c : Character.toLowerCase(c);
    }

    public static final int G(int i, int i2, CharSequence charSequence) {
        while (i2 > i) {
            int i3 = i2 - 1;
            if (!Th.n(charSequence.charAt(i3))) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    public static final Throwable H(Throwable th) {
        Throwable cause = th;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (ur1.a(cause, cancellationException.getCause())) {
                return th;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th : cause;
    }

    public static String I(a07 a07Var) {
        StringBuilder sb = new StringBuilder(a07Var.c());
        for (int i = 0; i < a07Var.c(); i++) {
            byte bA = a07Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final long a(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = kt2.e;
        return jFloatToIntBits;
    }

    public static final SocketTimeoutException b(jg1 jg1Var, Throwable th) {
        Object obj;
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(jg1Var.a);
        sb.append(", socket_timeout=");
        ah1.CQf cQf = ah1.d;
        ah1.QnHx qnHx = (ah1.QnHx) jg1Var.a();
        if (qnHx == null || (obj = qnHx.c) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return new SocketTimeoutException(sb.toString(), th);
    }

    public static final int d(int i, ui2 ui2Var) {
        int i2 = ui2Var.y - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = ui2Var.w;
            int i5 = ((yq1.QnHx) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((yq1.QnHx) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final Object[] e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        NPO.a0(objArr, objArr2, 0, 0, i, 6);
        System.arraycopy(objArr, i, objArr2, i + 2, objArr.length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        NPO.a0(objArr, objArr2, 0, 0, i, 6);
        int i2 = i + 2;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        NPO.a0(objArr, objArr2, 0, 0, i, 6);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final void i(hz2 hz2Var, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            while (i < i3 && Th.n(str.charAt(i))) {
                i++;
            }
            int iG = G(i, i3, str);
            if (iG > i) {
                hz2Var.c(z ? tt.e(str, i, iG, false, 12) : str.substring(i, iG), cs0.w);
                return;
            }
            return;
        }
        while (i < i2 && Th.n(str.charAt(i))) {
            i++;
        }
        int iG2 = G(i, i2, str);
        if (iG2 > i) {
            String strE = z ? tt.e(str, i, iG2, false, 12) : str.substring(i, iG2);
            int i4 = i2 + 1;
            while (i4 < i3 && Th.n(str.charAt(i4))) {
                i4++;
            }
            int iG3 = G(i4, i3, str);
            hz2Var.e(strE, z ? tt.e(str, i4, iG3, true, 8) : str.substring(i4, iG3));
        }
    }

    public static final int j(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final void k(long j, aw2 aw2Var) {
        if (aw2Var == aw2.Vertical) {
            if (!(g70.g(j) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else {
            if (!(g70.h(j) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
    }

    public static final ny l(double d) {
        return d < 0.0d ? new ny(0.0d, Math.sqrt(Math.abs(d))) : new ny(Math.sqrt(d), 0.0d);
    }

    public static final sz m(g30 g30Var, int i, cx1 cx1Var) {
        sz szVar;
        g30Var.e(i);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            szVar = new sz(i, true);
            g30Var.B(szVar);
        } else {
            if (objF == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            }
            szVar = (sz) objF;
        }
        szVar.f(cx1Var);
        g30Var.G();
        return szVar;
    }

    public static final sz n(int i, cx1 cx1Var, boolean z) {
        sz szVar = new sz(i, z);
        szVar.f(cx1Var);
        return szVar;
    }

    public static final z_Mm o(z_Mm z_mm) {
        z_Mm z_mmC = z_mm.c();
        int iB = z_mmC.b();
        for (int i = 0; i < iB; i++) {
            z_mmC.e(z_mm.a(i), i);
        }
        return z_mmC;
    }

    public static Typeface p(String str, x41 x41Var, int i) {
        if ((i == 0) && ur1.a(x41Var, x41.z)) {
            if (str == null || str.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        int iR = Cz.r(x41Var, i);
        return str == null || str.length() == 0 ? Typeface.defaultFromStyle(iR) : Typeface.create(str, iR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object q(ArrayList arrayList, fk fkVar, rb5 rb5Var, Charset charset, z80 z80Var) throws Throwable {
        u70 u70Var;
        if (z80Var instanceof u70) {
            u70Var = (u70) z80Var;
            int i = u70Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                u70Var.C = i - Integer.MIN_VALUE;
            } else {
                u70Var = new u70(z80Var);
            }
        } else {
            u70Var = new u70(z80Var);
        }
        Object objN = u70Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = u70Var.C;
        if (i2 == 0) {
            C0239D.H(objN);
            t70 t70Var = new t70(new pz0(arrayList), charset, rb5Var, fkVar);
            v70 v70Var = new v70(fkVar, null);
            u70Var.z = fkVar;
            u70Var.A = rb5Var;
            u70Var.C = 1;
            objN = kd.n(t70Var, v70Var, u70Var);
            if (objN == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb5Var = u70Var.A;
            fkVar = u70Var.z;
            C0239D.H(objN);
        }
        if (objN != null) {
            return objN;
        }
        if (!fkVar.r()) {
            return fkVar;
        }
        sv1 sv1Var = rb5Var.c;
        if (sv1Var != null && sv1Var.a()) {
            return kd.A;
        }
        throw new ContentConvertException("No suitable converter found for " + rb5Var);
    }

    public static final long r(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return Cz.a(i, i);
        }
        if (i == 0) {
            return z ? Cz.a(1, 0) : Cz.a(0, 1);
        }
        if (i == i2) {
            return z ? Cz.a(i2 - 1, i2) : Cz.a(i2, i2 - 1);
        }
        if (z) {
            return !z2 ? Cz.a(i - 1, i) : Cz.a(i + 1, i);
        }
        return !z2 ? Cz.a(i, i + 1) : Cz.a(i, i - 1);
    }

    public static String s(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static int t(View view, int i) {
        return w92.b(view.getContext(), view.getClass().getCanonicalName(), i);
    }

    public static final float u(o55 o55Var, int i, boolean z, boolean z2) {
        boolean z3 = o55Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == o55Var.m(i);
        kh2 kh2Var = o55Var.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        return yy2Var.a.s(yy2Var.a(i), z3);
    }

    public static final String v(int i, g30 g30Var) {
        String string;
        g30Var.e(-726638443);
        g30Var.E(Ll.a);
        Resources resources = ((Context) g30Var.E(Ll.b)).getResources();
        if (i == 0) {
            string = resources.getString(R.string.navigation_menu);
        } else {
            if (i == 1) {
                string = resources.getString(R.string.close_drawer);
            } else {
                if (i == 2) {
                    string = resources.getString(R.string.close_sheet);
                } else {
                    if (i == 3) {
                        string = resources.getString(R.string.default_error_message);
                    } else {
                        if (i == 4) {
                            string = resources.getString(R.string.dropdown_menu);
                        } else {
                            if (i == 5) {
                                string = resources.getString(R.string.range_start);
                            } else {
                                string = i == 6 ? resources.getString(R.string.range_end) : "";
                            }
                        }
                    }
                }
            }
        }
        g30Var.G();
        return string;
    }

    public static final boolean w(long j) {
        int i = kt2.e;
        return j != kt2.d;
    }

    public static int x(float f, int i, int i2) {
        return lv.b(lv.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final long y(long j, long j2, float f) {
        return a(C0239D.y(kt2.c(j), kt2.c(j2), f), C0239D.y(kt2.d(j), kt2.d(j2), f));
    }

    public static void z(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof xm5) {
                editorInfo.hintText = ((xm5) parent).a();
                return;
            }
        }
    }

    @Override // defpackage.u53
    public Typeface c(x41 x41Var, int i) {
        return p(null, x41Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    @Override // defpackage.u53
    public Typeface f(ba1 ba1Var, x41 x41Var, int i) {
        String strConcat;
        int i2 = x41Var.w / 100;
        boolean z = i2 >= 0 && i2 < 2;
        String str = ba1Var.x;
        if (z) {
            strConcat = str.concat("-thin");
        } else {
            if (2 <= i2 && i2 < 4) {
                strConcat = str.concat("-light");
            } else if (i2 == 4) {
                strConcat = str;
            } else if (i2 == 5) {
                strConcat = str.concat("-medium");
            } else {
                if (6 <= i2 && i2 < 8) {
                    strConcat = str;
                } else {
                    if (8 <= i2 && i2 < 11) {
                        strConcat = str.concat("-black");
                    } else {
                        strConcat = str;
                    }
                }
            }
        }
        Typeface typeface = null;
        if (!(strConcat.length() == 0)) {
            Typeface typefaceP = p(strConcat, x41Var, i);
            if ((ur1.a(typefaceP, Typeface.create(Typeface.DEFAULT, Cz.r(x41Var, i))) || ur1.a(typefaceP, p(null, x41Var, i))) ? false : true) {
                typeface = typefaceP;
            }
        }
        return typeface == null ? p(str, x41Var, i) : typeface;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(((i67) h67.x.w.zza()).zzb());
    }
}
