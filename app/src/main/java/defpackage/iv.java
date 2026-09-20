package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.azefsw.audioconnect.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class iv {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = qLd.B;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(i, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(i, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i3 = typedValue.type;
                    if (i3 >= 28 && i3 <= 31) {
                        color = typedArrayObtainAttributes.getColor(i, -65281);
                    } else {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i, -65281);
                        }
                    }
                }
                float f2 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i4);
                boolean z = f3 >= 0.0f && f3 <= 100.0f;
                if (f2 != 1.0f || z) {
                    int iM = C0239D.m((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                    if (z) {
                        jm jmVarA = jm.a(color);
                        ek5 ek5Var = ek5.k;
                        float f4 = jmVarA.b;
                        if (f4 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
                            float f5 = jmVarA.a;
                            float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                            float f6 = f4;
                            jm jmVar = null;
                            boolean z2 = true;
                            float f7 = 0.0f;
                            while (true) {
                                if (Math.abs(f7 - f4) < 0.4f) {
                                    depth2 = depth2;
                                    if (jmVar != null) {
                                        color = jmVar.c(ek5Var);
                                        break;
                                    }
                                    color = C0239D.x(f3);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = 1000.0f;
                                float f10 = 0.0f;
                                float f11 = 100.0f;
                                jm jmVar2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        break;
                                    }
                                    float f12 = ((f11 - f10) / 2.0f) + f10;
                                    int iC = jm.b(f12, f6, fMin).c(ek5.k);
                                    float fZ = C0239D.z(Color.red(iC));
                                    float fZ2 = C0239D.z(Color.green(iC));
                                    float fZ3 = C0239D.z(Color.blue(iC));
                                    float[] fArr = C0239D.z[1];
                                    float f13 = ((fZ3 * fArr[2]) + ((fZ2 * fArr[1]) + (fZ * fArr[0]))) / 100.0f;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f3 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        jm jmVarA2 = jm.a(iC);
                                        jm jmVarB = jm.b(jmVarA2.c, jmVarA2.b, fMin);
                                        f = f12;
                                        float f14 = jmVarA2.d - jmVarB.d;
                                        fMin = fMin;
                                        float f15 = jmVarA2.e - jmVarB.e;
                                        float f16 = jmVarA2.f - jmVarB.f;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            jmVar2 = jmVarA2;
                                            f9 = fPow;
                                            f8 = fAbs;
                                        }
                                    } else {
                                        f = f12;
                                        fMin = fMin;
                                    }
                                    if (f8 == 0.0f && f9 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f3) {
                                        f10 = f;
                                    } else {
                                        f11 = f;
                                    }
                                    depth2 = depth2;
                                    fMin = fMin;
                                }
                                jm jmVar3 = jmVar2;
                                if (!z2) {
                                    if (jmVar3 == null) {
                                        f4 = f6;
                                    } else {
                                        jmVar = jmVar3;
                                        f7 = f6;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                } else {
                                    if (jmVar3 != null) {
                                        color = jmVar3.c(ek5Var);
                                        break;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                    z2 = false;
                                }
                            }
                        } else {
                            depth2 = depth2;
                            color = C0239D.x(f3);
                        }
                    } else {
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iM << 24);
                } else {
                    depth2 = depth2;
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
                depth2 = depth2;
                r4 = 1;
                i = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
