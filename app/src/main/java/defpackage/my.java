package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class my {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public my(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    public static my a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = iv.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new my(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayI = zb5.i(resources, theme, attributeSetAsAttributeSet, qLd.E);
        float fD = zb5.d(typedArrayI, xml, "startX", 8, 0.0f);
        float fD2 = zb5.d(typedArrayI, xml, "startY", 9, 0.0f);
        float fD3 = zb5.d(typedArrayI, xml, "endX", 10, 0.0f);
        float fD4 = zb5.d(typedArrayI, xml, "endY", 11, 0.0f);
        float fD5 = zb5.d(typedArrayI, xml, "centerX", 3, 0.0f);
        float fD6 = zb5.d(typedArrayI, xml, "centerY", 4, 0.0f);
        int iE = zb5.e(typedArrayI, xml, "type", 2, 0);
        int color = !zb5.h(xml, "startColor") ? 0 : typedArrayI.getColor(0, 0);
        boolean zH = zb5.h(xml, "centerColor");
        int color2 = !zb5.h(xml, "centerColor") ? 0 : typedArrayI.getColor(7, 0);
        int color3 = !zb5.h(xml, "endColor") ? 0 : typedArrayI.getColor(1, 0);
        int iE2 = zb5.e(typedArrayI, xml, "tileMode", 6, 0);
        float fD7 = zb5.d(typedArrayI, xml, "gradientRadius", 5, 0.0f);
        typedArrayI.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = fD3;
            if (next2 == 1) {
                f2 = fD2;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = fD2;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayI2 = zb5.i(resources, theme, attributeSetAsAttributeSet, qLd.F);
                boolean zHasValue = typedArrayI2.hasValue(0);
                boolean zHasValue2 = typedArrayI2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayI2.getColor(0, 0);
                float f3 = typedArrayI2.getFloat(1, 0.0f);
                typedArrayI2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f3));
            }
            fD3 = f;
            fD2 = f2;
        }
        sa1 sa1Var = arrayList2.size() > 0 ? new sa1(arrayList2, arrayList) : null;
        if (sa1Var == null) {
            sa1Var = zH ? new sa1(color, color2, color3) : new sa1(color, color3);
        }
        if (iE != 1) {
            if (iE != 2) {
                int[] iArr = sa1Var.a;
                float[] fArr = sa1Var.b;
                if (iE2 != 1) {
                    tileMode2 = iE2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(fD, f2, f, fD4, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(fD5, fD6, sa1Var.a, sa1Var.b);
            }
        } else {
            if (fD7 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = sa1Var.a;
            float[] fArr2 = sa1Var.b;
            if (iE2 != 1) {
                tileMode = iE2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(fD5, fD6, fD7, iArr2, fArr2, tileMode);
        }
        return new my(radialGradient, null, 0);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }
}
