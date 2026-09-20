package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.LocaleList;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ko6 implements e53, qf6 {
    public static ej1 A;
    public static ej1 w;
    public static ej1 x;
    public static final int[] y = {R.attr.name, R.attr.id, R.attr.tag};
    public static final int[] z = {R.attr.name, R.attr.tag};
    public static final /* synthetic */ ko6 B = new ko6();

    public /* synthetic */ ko6() {
    }

    public static final hi2 b(String str, g30 g30Var) {
        g30Var.e(923020361);
        n03 n03Var = n03.w;
        e40.CQf cQf = e40.a;
        g30Var.e(1424240517);
        Context context = (Context) g30Var.E(Ll.b);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(str);
        Object objF = g30Var.f();
        Object obj = g30.QnHx.a;
        if (zI || objF == obj) {
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalStateException("Permissions should be called in the context of an Activity");
                }
                if (baseContext instanceof Activity) {
                    objF = new hi2(str, context, (Activity) baseContext);
                    g30Var.B(objF);
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        g30Var.G();
        hi2 hi2Var = (hi2) objF;
        u03.a(hi2Var, null, g30Var, 0, 2);
        Ffip ffip = new Ffip();
        g30Var.e(511388516);
        boolean zI2 = g30Var.I(hi2Var) | g30Var.I(n03Var);
        Object objF2 = g30Var.f();
        if (zI2 || objF2 == obj) {
            objF2 = new ki2(hi2Var, n03Var);
            g30Var.B(objF2);
        }
        g30Var.G();
        g82 g82VarJ = AY.J(ffip, (j81) objF2, g30Var);
        wq0.b(hi2Var, g82VarJ, new ji2(hi2Var, g82VarJ), g30Var);
        e40.CQf cQf2 = e40.a;
        g30Var.G();
        g30Var.G();
        return hi2Var;
    }

    public static final long c(long j, float f) {
        return hH.f(Math.max(0.0f, ha0.b(j) - f), Math.max(0.0f, ha0.c(j) - f));
    }

    public static String e(zzgnf zzgnfVar) {
        StringBuilder sb = new StringBuilder(zzgnfVar.zzd());
        for (int i = 0; i < zzgnfVar.zzd(); i++) {
            byte bZza = zzgnfVar.zza(i);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
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
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static int g(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int h(@CheckForNull Object obj) {
        return g(obj == null ? 0 : obj.hashCode());
    }

    public static int i(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iH = h(obj);
        int i2 = iH & i;
        int iJ = j(i2, obj3);
        if (iJ != 0) {
            int i3 = ~i;
            int i4 = iH & i3;
            int i5 = -1;
            while (true) {
                int i6 = iJ - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !zzfsa.zza(obj, objArr[i6]) || (objArr2 != null && !zzfsa.zza(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iJ = i8;
                } else {
                    int i9 = i7 & i;
                    if (i5 == -1) {
                        l(i2, i9, obj3);
                    } else {
                        iArr[i5] = (i9 & i) | (iArr[i5] & i3);
                    }
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int j(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object k(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(GM.a("must be power of 2 between 2^1 and 2^30: ", i));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static void l(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    @Override // defpackage.e53
    public List a() {
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new XX(localeList.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.e53
    public XX d(String str) {
        return new XX(Locale.forLanguageTag(str));
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzE());
    }

    public /* synthetic */ ko6(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.c = 0;
    }
}
