package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.azefsw.audioconnect.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qp3 {
    public static qp3 i;
    public WeakHashMap<Context, wq4<ColorStateList>> a;
    public ok4<String, NUlFixed> b;
    public wq4<String> c;
    public final WeakHashMap<Context, q62<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public YKK g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final F1 j = new F1();

    public static class CQf implements NUlFixed {
        @Override // qp3.NUlFixed
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                mV mVVar = new mV(context);
                mVVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return mVVar;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    public static class F1 extends t62<Integer, PorterDuffColorFilter> {
        public F1() {
            super(6);
        }
    }

    public static class LPt8Fixed implements NUlFixed {
        @Override // qp3.NUlFixed
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) LPt8Fixed.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                ow.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                return null;
            }
        }
    }

    public interface NUlFixed {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static class QnHx implements NUlFixed {
        @Override // qp3.NUlFixed
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return UYD.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    public interface YKK {
    }

    public static class auxFixed implements NUlFixed {
        @Override // qp3.NUlFixed
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                og5 og5Var = new og5();
                og5Var.inflate(resources, xmlResourceParser, attributeSet, theme);
                return og5Var;
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized qp3 d() {
        if (i == null) {
            qp3 qp3Var = new qp3();
            i = qp3Var;
            j(qp3Var);
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        F1 f1 = j;
        f1.getClass();
        int i3 = (i2 + 31) * 31;
        porterDuffColorFilterB = f1.b(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i2, mode);
            f1.c(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    public static void j(qp3 qp3Var) {
        if (Build.VERSION.SDK_INT < 24) {
            qp3Var.a("vector", new auxFixed());
            qp3Var.a("animated-vector", new CQf());
            qp3Var.a("animated-selector", new QnHx());
            qp3Var.a("drawable", new LPt8Fixed());
        }
    }

    public final void a(String str, NUlFixed nUl) {
        if (this.b == null) {
            this.b = new ok4<>();
        }
        this.b.put(str, nUl);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            q62<WeakReference<Drawable.ConstantState>> q62Var = this.d.get(context);
            if (q62Var == null) {
                q62Var = new q62<>();
                this.d.put(context, q62Var);
            }
            q62Var.j(j2, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    public final Drawable c(Context context, int i2) {
        LayerDrawable layerDrawableC;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        if (this.g == null) {
            layerDrawableC = null;
        } else if (i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawableC = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i2 == R.drawable.abc_ratingbar_material) {
            layerDrawableC = Mt0.QnHx.c(this, context, R.dimen.abc_star_big);
        } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableC = Mt0.QnHx.c(this, context, R.dimen.abc_star_medium);
        } else if (i2 == R.drawable.abc_ratingbar_small_material) {
            layerDrawableC = Mt0.QnHx.c(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableC = null;
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable e(Context context, long j2) {
        q62<WeakReference<Drawable.ConstantState>> q62Var = this.d.get(context);
        if (q62Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) q62Var.i(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iD = o70.d(q62Var.x, q62Var.z, j2);
            if (iD >= 0) {
                Object[] objArr = q62Var.y;
                Object obj = objArr[iD];
                Object obj2 = q62.A;
                if (obj != obj2) {
                    objArr[iD] = obj2;
                    q62Var.w = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (((r0 instanceof defpackage.og5) || "android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName())) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp3.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        wq4<ColorStateList> wq4Var;
        try {
            WeakHashMap<Context, wq4<ColorStateList>> weakHashMap = this.a;
            ColorStateList colorStateListD = null;
            colorStateList = (weakHashMap == null || (wq4Var = weakHashMap.get(context)) == null) ? null : (ColorStateList) wq4Var.i(i2, null);
            if (colorStateList == null) {
                YKK ykk = this.g;
                if (ykk != null) {
                    colorStateListD = ((Mt0.QnHx) ykk).d(context, i2);
                }
                if (colorStateListD != null) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    wq4<ColorStateList> wq4Var2 = this.a.get(context);
                    if (wq4Var2 == null) {
                        wq4Var2 = new wq4<>();
                        this.a.put(context, wq4Var2);
                    }
                    wq4Var2.a(i2, colorStateListD);
                }
                colorStateList = colorStateListD;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final boolean k(Context context, int i2, Drawable drawable) {
        int iRound;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        Drawable drawableMutate;
        YKK ykk = this.g;
        if (ykk == null) {
            return false;
        }
        Mt0.QnHx qnHx = (Mt0.QnHx) ykk;
        PorterDuff.Mode mode = Mt0.b;
        if (Mt0.QnHx.a(qnHx.a, i2)) {
            i4 = R.attr.colorControlNormal;
        } else if (Mt0.QnHx.a(qnHx.c, i2)) {
            i4 = R.attr.colorControlActivated;
        } else {
            if (!Mt0.QnHx.a(qnHx.d, i2)) {
                if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i3 = android.R.attr.colorForeground;
                    z = true;
                } else if (i2 != R.drawable.abc_dialog_material_background) {
                    iRound = -1;
                    i3 = 0;
                    z = false;
                }
                if (z) {
                    int[] iArr = bp0.a;
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(Mt0.c(c75.c(context, i3), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
                return false;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i4 = android.R.attr.colorBackground;
        }
        i3 = i4;
        iRound = -1;
        z = true;
        if (z) {
            int[] iArr2 = bp0.a;
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(Mt0.c(c75.c(context, i3), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }
}
