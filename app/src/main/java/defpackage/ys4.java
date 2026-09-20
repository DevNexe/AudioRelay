package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class ys4 {
    public static final int m;
    public static boolean n;
    public static Constructor<StaticLayout> o;
    public static TextDirectionHeuristic p;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;
    public int i = m;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    public static class QnHx extends Exception {
        public QnHx(Exception exc) {
            super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
        }
    }

    static {
        m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public ys4(int i, TextPaint textPaint, CharSequence charSequence) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.d);
        this.d = iMin;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (!n) {
                try {
                    p = this.k && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    n = true;
                } catch (Exception e) {
                    throw new QnHx(e);
                }
            }
            try {
                Constructor<StaticLayout> constructor = o;
                constructor.getClass();
                TextDirectionHeuristic textDirectionHeuristic = p;
                textDirectionHeuristic.getClass();
                return constructor.newInstance(charSequenceEllipsize, 0, Integer.valueOf(this.d), textPaint, Integer.valueOf(iMax), this.e, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.j), null, Integer.valueOf(iMax), Integer.valueOf(this.f));
            } catch (Exception e2) {
                throw new QnHx(e2);
            }
        }
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.g;
        if (f != 0.0f || this.h != 1.0f) {
            builderObtain.setLineSpacing(f, this.h);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.i);
        }
        return builderObtain.build();
    }
}
