package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class sp3 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<LPt8Fixed, SparseArray<F1>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    public static class CQf {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class F1 {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public F1(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class LPt8Fixed {
        public final Resources a;
        public final Resources.Theme b;

        public LPt8Fixed(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || LPt8Fixed.class != obj.getClass()) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return this.a.equals(lPt8.a) && uq2.a(this.b, lPt8.b);
        }

        public final int hashCode() {
            return uq2.b(this.a, this.b);
        }
    }

    public static abstract class NUlFixed {
        public final void a(final int i) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: up3
                @Override // java.lang.Runnable
                public final void run() {
                    this.w.c(i);
                }
            });
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new tp3(0, this, typeface));
        }

        public abstract void c(int i);

        public abstract void d(Typeface typeface);
    }

    public static class QnHx {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, NUlFixed nUl, boolean z, boolean z2) {
        Typeface typefaceB;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            t62<String, Typeface> t62Var = ac5.b;
            typefaceB = t62Var.b(ac5.b(resources, i, string, i3, i2));
            if (typefaceB != null) {
                if (nUl != null) {
                    nUl.b(typefaceB);
                }
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        u41.CQf cQfA = u41.a(resources.getXml(i), resources);
                        if (cQfA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (nUl != null) {
                                nUl.a(-3);
                            }
                        } else {
                            typefaceB = ac5.a(context, cQfA, resources, i, string, typedValue.assetCookie, i2, nUl, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typefaceB = ac5.a.d(context, resources, i, string, i2);
                        if (typefaceB != null) {
                            t62Var.c(ac5.b(resources, i, string, i4, i2), typefaceB);
                        }
                        if (nUl != null) {
                            if (typefaceB != null) {
                                nUl.b(typefaceB);
                            } else {
                                nUl.a(-3);
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (nUl != null) {
                        nUl.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (nUl != null) {
                        nUl.a(-3);
                    }
                }
            }
            if (typefaceB == null || nUl != null || z2) {
                return typefaceB;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        if (nUl != null) {
            nUl.a(-3);
        }
        typefaceB = null;
        if (typefaceB == null) {
        }
        return typefaceB;
    }
}
