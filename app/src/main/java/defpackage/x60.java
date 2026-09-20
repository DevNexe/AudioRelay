package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x60 {
    public final int a;
    public int b;
    public float c;
    public String d;
    public boolean e;
    public int f;

    public x60(String str, int i, Object obj) {
        this.a = i;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g7.A);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object string2 = null;
        int i = 0;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 8) {
                    string2 = typedArrayObtainStyledAttributes.getString(index);
                    i = 5;
                }
                i = 7;
            }
        }
        if (string != null && string2 != null) {
            map.put(string, new x60(string, i, string2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (O.h(this.a)) {
            case 0:
                this.b = ((Integer) obj).intValue();
                break;
            case 1:
                this.c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f = ((Integer) obj).intValue();
                break;
            case 4:
                this.d = (String) obj;
                break;
            case 5:
                this.e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.c = ((Float) obj).floatValue();
                break;
        }
    }

    public x60(x60 x60Var, Object obj) {
        x60Var.getClass();
        this.a = x60Var.a;
        b(obj);
    }
}
