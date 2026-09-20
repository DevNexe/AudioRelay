package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c2Z {

    public static class QnHx implements TypeEvaluator<wz2.QnHx[]> {
        public wz2.QnHx[] a;

        @Override // android.animation.TypeEvaluator
        public final wz2.QnHx[] evaluate(float f, wz2.QnHx[] qnHxArr, wz2.QnHx[] qnHxArr2) {
            wz2.QnHx[] qnHxArr3 = qnHxArr;
            wz2.QnHx[] qnHxArr4 = qnHxArr2;
            if (!wz2.a(qnHxArr3, qnHxArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!wz2.a(this.a, qnHxArr3)) {
                this.a = wz2.e(qnHxArr3);
            }
            for (int i = 0; i < qnHxArr3.length; i++) {
                wz2.QnHx qnHx = this.a[i];
                wz2.QnHx qnHx2 = qnHxArr3[i];
                wz2.QnHx qnHx3 = qnHxArr4[i];
                qnHx.getClass();
                qnHx.a = qnHx2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = qnHx2.b;
                    if (i2 < fArr.length) {
                        qnHx.b[i2] = (qnHx3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x030d  */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolderC;
        int size;
        int i2;
        Keyframe keyframeOfFloat;
        Animator animatorE;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i3 = 3;
            boolean z = false;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i4 = 1;
            if (next == 1) {
                break;
            }
            int i5 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    e(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorE = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorE = e(context, resources, theme, attributeSet, null, xmlResourceParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayI = zb5.i(resources2, theme2, attributeSet, YYQR.h);
                        a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, zb5.e(typedArrayI, xmlResourceParser, "ordering", 0, 0));
                        typedArrayI.recycle();
                        animator = animatorSet2;
                    } else {
                        String str2 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i3 || eventType == i4) {
                                break;
                            }
                            if (eventType != i5) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str2)) {
                                    TypedArray typedArrayI2 = zb5.i(resources2, theme2, attributeSetAsAttributeSet, YYQR.i);
                                    String strF = zb5.f(typedArrayI2, xmlResourceParser, "propertyName", i3);
                                    int iE = zb5.e(typedArrayI2, xmlResourceParser, "valueType", i5, 4);
                                    int i6 = iE;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        attributeSet2 = attributeSetAsAttributeSet;
                                        if (next2 == i3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = YYQR.j;
                                            if (i6 == 4) {
                                                TypedArray typedArrayI3 = zb5.i(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue typedValuePeekValue = !zb5.h(xmlResourceParser, "value") ? null : typedArrayI3.peekValue(0);
                                                i6 = ((typedValuePeekValue != null) && d(typedValuePeekValue.type)) ? 3 : 0;
                                                typedArrayI3.recycle();
                                            }
                                            TypedArray typedArrayI4 = zb5.i(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float fD = zb5.d(typedArrayI4, xmlResourceParser, "fraction", 3, -1.0f);
                                            TypedValue typedValuePeekValue2 = !zb5.h(xmlResourceParser, "value") ? null : typedArrayI4.peekValue(0);
                                            boolean z2 = typedValuePeekValue2 != null;
                                            int i7 = i6 == 4 ? (z2 && d(typedValuePeekValue2.type)) ? 3 : 0 : i6;
                                            if (!z2) {
                                                keyframeOfFloat = i7 == 0 ? Keyframe.ofFloat(fD) : Keyframe.ofInt(fD);
                                            } else if (i7 != 0) {
                                                keyframeOfFloat = (i7 == 1 || i7 == 3) ? Keyframe.ofInt(fD, zb5.e(typedArrayI4, xmlResourceParser, "value", 0, 0)) : null;
                                            } else {
                                                keyframeOfFloat = Keyframe.ofFloat(fD, zb5.d(typedArrayI4, xmlResourceParser, "value", 0, 0.0f));
                                            }
                                            int resourceId = !zb5.h(xmlResourceParser, "interpolator") ? 0 : typedArrayI4.getResourceId(1, 0);
                                            if (resourceId > 0) {
                                                keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            typedArrayI4.recycle();
                                            ArrayList arrayList4 = arrayList3;
                                            if (keyframeOfFloat != null) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(keyframeOfFloat);
                                                arrayList3 = arrayList4;
                                            }
                                            xmlResourceParser.next();
                                        }
                                        resources2 = resources;
                                        theme2 = theme;
                                        attributeSetAsAttributeSet = attributeSet2;
                                        str2 = str2;
                                        i3 = 3;
                                    }
                                    str = str2;
                                    ArrayList arrayList5 = arrayList3;
                                    if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                                        i3 = 3;
                                        propertyValuesHolderC = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList5.add(arrayList5.size(), b(keyframe2, 1.0f));
                                                size++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList5.add(0, b(keyframe, 0.0f));
                                                size++;
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList5.toArray(keyframeArr);
                                        int i8 = 0;
                                        while (i8 < size) {
                                            Keyframe keyframe3 = keyframeArr[i8];
                                            if (keyframe3.getFraction() >= 0.0f) {
                                                i2 = size;
                                            } else {
                                                if (i8 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i9 = size - 1;
                                                    if (i8 == i9) {
                                                        keyframe3.setFraction(1.0f);
                                                    } else {
                                                        int i10 = i8;
                                                        for (int i11 = i8 + 1; i11 < i9 && keyframeArr[i11].getFraction() < 0.0f; i11++) {
                                                            i10 = i11;
                                                        }
                                                        float fraction3 = (keyframeArr[i10 + 1].getFraction() - keyframeArr[i8 - 1].getFraction()) / ((i10 - i8) + 2);
                                                        int i12 = i8;
                                                        while (true) {
                                                            i2 = size;
                                                            if (i12 <= i10) {
                                                                keyframeArr[i12].setFraction(keyframeArr[i12 - 1].getFraction() + fraction3);
                                                                i12++;
                                                                size = i2;
                                                                i10 = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                                i2 = size;
                                            }
                                            i8++;
                                            size = i2;
                                        }
                                        propertyValuesHolderC = PropertyValuesHolder.ofKeyframe(strF, keyframeArr);
                                        i3 = 3;
                                        if (i6 == 3) {
                                            propertyValuesHolderC.setEvaluator(oD.a);
                                        }
                                    }
                                    if (propertyValuesHolderC == null) {
                                        propertyValuesHolderC = c(typedArrayI2, iE, 0, 1, strF);
                                    }
                                    if (propertyValuesHolderC != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolderC);
                                    }
                                    typedArrayI2.recycle();
                                } else {
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    str = str2;
                                }
                                xmlResourceParser.next();
                                resources2 = resources;
                                theme2 = theme;
                                attributeSetAsAttributeSet = attributeSet2;
                                str2 = str;
                                i4 = 1;
                                i5 = 2;
                            }
                        }
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i13 = 0; i13 < size2; i13++) {
                                propertyValuesHolderArr[i13] = (PropertyValuesHolder) arrayList2.get(i13);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (animator instanceof ValueAnimator)) {
                            ((ValueAnimator) animator).setValues(propertyValuesHolderArr);
                        }
                        z = true;
                        animator = animator;
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                }
                animator = animatorE;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator);
                }
                resources2 = resources;
                theme2 = theme;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                animatorArr[i14] = (Animator) it.next();
                i14++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    public static Keyframe b(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && d(i4)) || (z2 && d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            wz2.QnHx[] qnHxArrC = wz2.c(string);
            wz2.QnHx[] qnHxArrC2 = wz2.c(string2);
            if (qnHxArrC == null && qnHxArrC2 == null) {
                return null;
            }
            if (qnHxArrC == null) {
                if (qnHxArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new QnHx(), qnHxArrC2);
                }
                return null;
            }
            QnHx qnHx = new QnHx();
            if (qnHxArrC2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, qnHx, qnHxArrC);
            } else {
                if (!wz2.a(qnHxArrC, qnHxArrC2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, qnHx, qnHxArrC, qnHxArrC2);
            }
            return propertyValuesHolderOfObject;
        }
        oD oDVar = i == 3 ? oD.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else {
                color = d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || oDVar == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(oDVar);
        return propertyValuesHolderOfInt;
    }

    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayI = zb5.i(resources, theme, attributeSet, YYQR.g);
        TypedArray typedArrayI2 = zb5.i(resources, theme, attributeSet, YYQR.k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long jE = zb5.e(typedArrayI, xmlResourceParser, "duration", 1, RCHTTPStatusCodes.UNSUCCESSFUL);
        int resourceId = 0;
        long jE2 = zb5.e(typedArrayI, xmlResourceParser, "startOffset", 2, 0);
        int iE = zb5.e(typedArrayI, xmlResourceParser, "valueType", 7, 4);
        if (zb5.h(xmlResourceParser, "valueFrom") && zb5.h(xmlResourceParser, "valueTo")) {
            if (iE == 4) {
                TypedValue typedValuePeekValue = typedArrayI.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayI.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                iE = ((z && d(i)) || (z2 && d(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderC = c(typedArrayI, iE, 5, 6, "");
            if (propertyValuesHolderC != null) {
                valueAnimator3.setValues(propertyValuesHolderC);
            }
        }
        valueAnimator3.setDuration(jE);
        valueAnimator3.setStartDelay(jE2);
        valueAnimator3.setRepeatCount(zb5.e(typedArrayI, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(zb5.e(typedArrayI, xmlResourceParser, "repeatMode", 4, 1));
        if (typedArrayI2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strF = zb5.f(typedArrayI2, xmlResourceParser, "pathData", 1);
            if (strF != null) {
                String strF2 = zb5.f(typedArrayI2, xmlResourceParser, "propertyXName", 2);
                String strF3 = zb5.f(typedArrayI2, xmlResourceParser, "propertyYName", 3);
                if (strF2 == null && strF3 == null) {
                    throw new InflateException(typedArrayI2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = wz2.d(strF);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathD, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayI;
                int i2 = 0;
                float f2 = 0.0f;
                while (true) {
                    if (resourceId >= iMin) {
                        break;
                    }
                    int i3 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
                    fArr[resourceId] = fArr3[0];
                    fArr2[resourceId] = fArr3[1];
                    f2 += f;
                    int i4 = i2 + 1;
                    if (i4 < arrayList.size() && f2 > ((Float) arrayList.get(i4)).floatValue()) {
                        pathMeasure2.nextContour();
                        i2 = i4;
                    }
                    resourceId++;
                    iMin = i3;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strF2 != null ? PropertyValuesHolder.ofFloat(strF2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strF3 != null ? PropertyValuesHolder.ofFloat(strF3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayI;
                objectAnimator2.setPropertyName(zb5.f(typedArrayI2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayI;
        }
        if (zb5.h(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayI2 != null) {
            typedArrayI2.recycle();
        }
        return valueAnimator2;
    }
}
