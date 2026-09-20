package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.xApe;
import defpackage.yj5;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class CQf extends ViewGroup {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public int[] E;
    public int[] F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public static class QnHx extends LinearLayout.LayoutParams {
        public QnHx(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public QnHx(int i, int i2) {
            super(i, i2);
        }

        public QnHx(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public CQf(Context context) {
        this(context, null);
    }

    public final void b(Canvas canvas, int i) {
        this.G.setBounds(getPaddingLeft() + this.K, i, (getWidth() - getPaddingRight()) - this.K, this.I + i);
        this.G.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof QnHx;
    }

    public final void d(Canvas canvas, int i) {
        this.G.setBounds(i, getPaddingTop() + this.K, this.H + i, (getHeight() - getPaddingBottom()) - this.K);
        this.G.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public QnHx generateDefaultLayoutParams() {
        int i = this.z;
        if (i == 0) {
            return new QnHx(-2, -2);
        }
        if (i == 1) {
            return new QnHx(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public QnHx generateLayoutParams(AttributeSet attributeSet) {
        return new QnHx(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public QnHx generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new QnHx(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.x < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.x;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.x == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.y;
        if (this.z == 1 && (i = this.A & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.B) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.B;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((QnHx) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.x;
    }

    public Drawable getDividerDrawable() {
        return this.G;
    }

    public int getDividerPadding() {
        return this.K;
    }

    public int getDividerWidth() {
        return this.H;
    }

    public int getGravity() {
        return this.A;
    }

    public int getOrientation() {
        return this.z;
    }

    public int getShowDividers() {
        return this.J;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.C;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.J & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.J & 4) != 0;
        }
        if ((this.J & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.G == null) {
            return;
        }
        int i2 = 0;
        if (this.z == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((QnHx) childAt.getLayoutParams())).topMargin) - this.I);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.I;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((QnHx) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = yj5.a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                QnHx qnHx = (QnHx) childAt3.getLayoutParams();
                d(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) qnHx).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) qnHx).leftMargin) - this.H);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                QnHx qnHx2 = (QnHx) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) qnHx2).leftMargin;
                    i = this.H;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) qnHx2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.H;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.CQf");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.CQf");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        int i15 = 5;
        if (this.z == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.A;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            if (i18 != 16) {
                paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.B;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.B) / 2);
            }
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    QnHx qnHx = (QnHx) childAt.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) qnHx).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    Field field = bi5.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, bi5.NUlFixed.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i15) {
                            i13 = ((LinearLayout.LayoutParams) qnHx).leftMargin + paddingLeft2;
                        } else {
                            i11 = paddingRight - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) qnHx).rightMargin;
                        }
                        if (h(i20)) {
                            paddingTop += this.I;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) qnHx).topMargin;
                        int i23 = i22 + 0;
                        childAt.layout(i13, i23, measuredWidth + i13, measuredHeight2 + i23);
                        i20 += 0;
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) qnHx).bottomMargin + 0 + i22;
                    } else {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) qnHx).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) qnHx).rightMargin;
                    }
                    i13 = i11 - i12;
                    if (h(i20)) {
                        paddingTop += this.I;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) qnHx).topMargin;
                    int i25 = i24 + 0;
                    childAt.layout(i13, i25, measuredWidth + i13, measuredHeight2 + i25);
                    i20 += 0;
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) qnHx).bottomMargin + 0 + i24;
                }
                i20++;
                i14 = 8;
                i15 = 5;
            }
            return;
        }
        boolean zA = yj5.a(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i4 - i2;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.A;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z2 = this.w;
        int[] iArr = this.E;
        int[] iArr2 = this.F;
        Field field2 = bi5.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, bi5.NUlFixed.d(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.B;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.B) / 2);
        }
        if (zA) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i30 = paddingLeft;
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i6 * i31) + i5;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i30 += 0;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    QnHx qnHx2 = (QnHx) childAt2.getLayoutParams();
                    if (z2) {
                        i7 = i5;
                        i8 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) qnHx2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) qnHx2).gravity;
                        if (i9 < 0) {
                            i9 = i29;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) qnHx2).topMargin) - ((LinearLayout.LayoutParams) qnHx2).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) qnHx2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) qnHx2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i32)) {
                            i30 += this.H;
                        }
                        int i33 = i30 + ((LinearLayout.LayoutParams) qnHx2).leftMargin;
                        int i34 = i33 + 0;
                        childAt2.layout(i34, measuredHeight, measuredWidth2 + i34, measuredHeight3 + measuredHeight);
                        i30 = measuredWidth2 + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0 + i33;
                        i31 += 0;
                    } else {
                        i7 = i5;
                        i8 = virtualChildCount2;
                    }
                    i9 = ((LinearLayout.LayoutParams) qnHx2).gravity;
                    if (i9 < 0) {
                        i9 = i29;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) qnHx2).topMargin) - ((LinearLayout.LayoutParams) qnHx2).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) qnHx2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) qnHx2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (h(i32)) {
                        i30 += this.H;
                    }
                    int i35 = i30 + ((LinearLayout.LayoutParams) qnHx2).leftMargin;
                    int i36 = i35 + 0;
                    childAt2.layout(i36, measuredHeight, measuredWidth2 + i36, measuredHeight3 + measuredHeight);
                    i30 = measuredWidth2 + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0 + i35;
                    i31 += 0;
                }
                i31++;
                i5 = i7;
                virtualChildCount2 = i8;
                i29 = i29;
            }
            i7 = i5;
            i8 = virtualChildCount2;
            i31++;
            i5 = i7;
            virtualChildCount2 = i8;
            i29 = i29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0304  */
    /* JADX WARN: Code duplicated, block: B:219:0x049a  */
    /* JADX WARN: Code duplicated, block: B:220:0x049f  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:224:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:236:0x0509  */
    /* JADX WARN: Code duplicated, block: B:245:0x0550  */
    /* JADX WARN: Code duplicated, block: B:251:0x0561  */
    /* JADX WARN: Code duplicated, block: B:254:0x0569 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x056b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0574  */
    /* JADX WARN: Code duplicated, block: B:259:0x0578  */
    /* JADX WARN: Code duplicated, block: B:286:0x0608  */
    /* JADX WARN: Code duplicated, block: B:288:0x060e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0614  */
    /* JADX WARN: Code duplicated, block: B:291:0x061c  */
    /* JADX WARN: Code duplicated, block: B:292:0x061f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0627  */
    /* JADX WARN: Code duplicated, block: B:295:0x0635  */
    /* JADX WARN: Code duplicated, block: B:319:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:321:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:324:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:326:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:374:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:376:0x0804  */
    /* JADX WARN: Code duplicated, block: B:380:0x082f  */
    /* JADX WARN: Code duplicated, block: B:389:0x0842  */
    /* JADX WARN: Code duplicated, block: B:392:0x0871  */
    /* JADX WARN: Code duplicated, block: B:395:0x0876  */
    /* JADX WARN: Code duplicated, block: B:398:0x0899  */
    /* JADX WARN: Code duplicated, block: B:400:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:402:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:404:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:405:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:443:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int iMax;
        int i3;
        float f;
        int i4;
        int i5;
        int iCombineMeasuredStates;
        int i6;
        int i7;
        int i8;
        char c2;
        int i9;
        View childAt;
        int i10;
        int i11;
        int i12;
        int i13;
        int baseline;
        int i14;
        int iMakeMeasureSpec;
        View childAt2;
        QnHx qnHx;
        int i15;
        int i16;
        View childAt3;
        QnHx qnHx2;
        int i17;
        int i18;
        float f2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z;
        boolean z2;
        QnHx qnHx3;
        int measuredWidth;
        boolean z3;
        int i25;
        boolean z4;
        int i26;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i27;
        int i28;
        boolean z6;
        boolean z7;
        int i29;
        int i30;
        QnHx qnHx4;
        boolean z8;
        int i31;
        boolean z9;
        int iCombineMeasuredStates2;
        int i32 = -2;
        int i33 = Integer.MIN_VALUE;
        int i34 = 8;
        float f3 = 0.0f;
        int i35 = 1073741824;
        int i36 = 0;
        if (this.z == 1) {
            this.B = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i37 = this.x;
            boolean z10 = this.D;
            int i38 = 0;
            int iMax2 = 0;
            int i39 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            int i40 = 0;
            float f4 = 0.0f;
            boolean z11 = false;
            boolean z12 = true;
            boolean z13 = false;
            while (i38 < virtualChildCount) {
                View childAt4 = getChildAt(i38);
                if (childAt4 == null) {
                    this.B += i36;
                } else {
                    if (childAt4.getVisibility() == i34) {
                        i38 += 0;
                    } else {
                        if (h(i38)) {
                            this.B += this.I;
                        }
                        QnHx qnHx5 = (QnHx) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) qnHx5).weight;
                        f4 += f5;
                        if (mode2 == i35 && ((LinearLayout.LayoutParams) qnHx5).height == 0 && f5 > f3) {
                            int i41 = this.B;
                            this.B = Math.max(i41, ((LinearLayout.LayoutParams) qnHx5).topMargin + i41 + ((LinearLayout.LayoutParams) qnHx5).bottomMargin);
                            qnHx4 = qnHx5;
                            z8 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) qnHx5).height != 0 || f5 <= f3) {
                                i30 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) qnHx5).height = i32;
                                i30 = 0;
                            }
                            int i42 = f4 == f3 ? this.B : 0;
                            qnHx4 = qnHx5;
                            measureChildWithMargins(childAt4, i, 0, i2, i42);
                            if (i30 != i33) {
                                ((LinearLayout.LayoutParams) qnHx4).height = i30;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i43 = this.B;
                            this.B = Math.max(i43, i43 + measuredHeight2 + ((LinearLayout.LayoutParams) qnHx4).topMargin + ((LinearLayout.LayoutParams) qnHx4).bottomMargin + 0);
                            if (z10) {
                                iMax3 = Math.max(measuredHeight2, iMax3);
                            }
                            z8 = z11;
                        }
                        if (i37 >= 0 && i37 == i38 + 1) {
                            this.y = this.B;
                        }
                        if (i38 < i37 && ((LinearLayout.LayoutParams) qnHx4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i31 = mode;
                        if (i31 == 1073741824 || ((LinearLayout.LayoutParams) qnHx4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i44 = ((LinearLayout.LayoutParams) qnHx4).leftMargin + ((LinearLayout.LayoutParams) qnHx4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i44;
                        int iMax5 = Math.max(i40, measuredWidth2);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(i39, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((LinearLayout.LayoutParams) qnHx4).width == -1;
                        if (((LinearLayout.LayoutParams) qnHx4).weight > 0.0f) {
                            if (!z9) {
                                i44 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i44);
                        } else {
                            int i45 = iMax4;
                            if (!z9) {
                                i44 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i44);
                            iMax4 = i45;
                        }
                        i38 += 0;
                        i40 = iMax5;
                        z11 = z8;
                        z12 = z14;
                    }
                    i38++;
                    mode = i31;
                    i37 = i37;
                    i39 = iCombineMeasuredStates2;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i36 = 0;
                    i32 = -2;
                    i33 = Integer.MIN_VALUE;
                    i34 = 8;
                    f3 = 0.0f;
                    i35 = 1073741824;
                }
                i37 = i37;
                mode2 = mode2;
                i31 = mode;
                virtualChildCount = virtualChildCount;
                iCombineMeasuredStates2 = i39;
                i38++;
                mode = i31;
                i37 = i37;
                i39 = iCombineMeasuredStates2;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i36 = 0;
                i32 = -2;
                i33 = Integer.MIN_VALUE;
                i34 = 8;
                f3 = 0.0f;
                i35 = 1073741824;
            }
            int i46 = mode2;
            int i47 = mode;
            int i48 = virtualChildCount;
            int iMax6 = iMax2;
            int iCombineMeasuredStates3 = i39;
            int i49 = iMax3;
            int i50 = iMax4;
            int i51 = i40;
            if (this.B > 0 && h(i48)) {
                this.B += this.I;
            }
            int i52 = i46;
            if (z10 && (i52 == Integer.MIN_VALUE || i52 == 0)) {
                int i53 = 0;
                this.B = 0;
                int i54 = 0;
                while (i54 < i48) {
                    View childAt5 = getChildAt(i54);
                    if (childAt5 == null) {
                        this.B += i53;
                    } else if (childAt5.getVisibility() == 8) {
                        i54 += 0;
                    } else {
                        QnHx qnHx6 = (QnHx) childAt5.getLayoutParams();
                        int i55 = this.B;
                        this.B = Math.max(i55, i55 + i49 + ((LinearLayout.LayoutParams) qnHx6).topMargin + ((LinearLayout.LayoutParams) qnHx6).bottomMargin + 0);
                    }
                    i54++;
                    i53 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.B;
            this.B = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i56 = (16777215 & iResolveSizeAndState) - this.B;
            if (z11 || (i56 != 0 && f4 > 0.0f)) {
                float f6 = this.C;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.B = 0;
                int i57 = 0;
                while (i57 < i48) {
                    View childAt6 = getChildAt(i57);
                    if (childAt6.getVisibility() != 8) {
                        QnHx qnHx7 = (QnHx) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) qnHx7).weight;
                        if (f7 > 0.0f) {
                            int i58 = (int) ((i56 * f7) / f4);
                            f4 -= f7;
                            int i59 = i56 - i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) qnHx7).leftMargin + ((LinearLayout.LayoutParams) qnHx7).rightMargin, ((LinearLayout.LayoutParams) qnHx7).width);
                            if (((LinearLayout.LayoutParams) qnHx7).height == 0) {
                                i29 = 1073741824;
                                if (i52 == 1073741824) {
                                    if (i58 <= 0) {
                                        i58 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i58, 1073741824));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                i56 = i59;
                            } else {
                                i29 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i58;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i29));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i56 = i59;
                        }
                        int i60 = ((LinearLayout.LayoutParams) qnHx7).leftMargin + ((LinearLayout.LayoutParams) qnHx7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i60;
                        int iMax7 = Math.max(i51, measuredWidth3);
                        if (i47 != 1073741824) {
                            i27 = iMax7;
                            i28 = -1;
                            z6 = ((LinearLayout.LayoutParams) qnHx7).width == -1;
                            if (!z6) {
                                i60 = measuredWidth3;
                            }
                            int iMax8 = Math.max(iMax6, i60);
                            if (z12 || ((LinearLayout.LayoutParams) qnHx7).width != i28) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i61 = this.B;
                            this.B = Math.max(i61, childAt6.getMeasuredHeight() + i61 + ((LinearLayout.LayoutParams) qnHx7).topMargin + ((LinearLayout.LayoutParams) qnHx7).bottomMargin + 0);
                            z12 = z7;
                            i51 = i27;
                            iMax6 = iMax8;
                        } else {
                            i27 = iMax7;
                            i28 = -1;
                        }
                        if (!z6) {
                            i60 = measuredWidth3;
                        }
                        int iMax9 = Math.max(iMax6, i60);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i62 = this.B;
                        this.B = Math.max(i62, childAt6.getMeasuredHeight() + i62 + ((LinearLayout.LayoutParams) qnHx7).topMargin + ((LinearLayout.LayoutParams) qnHx7).bottomMargin + 0);
                        z12 = z7;
                        i51 = i27;
                        iMax6 = iMax9;
                    }
                    i57++;
                    i52 = i52;
                }
                this.B = getPaddingBottom() + getPaddingTop() + this.B;
            } else {
                iMax6 = Math.max(iMax6, i50);
                if (z10 && i52 != 1073741824) {
                    for (int i63 = 0; i63 < i48; i63++) {
                        View childAt7 = getChildAt(i63);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((QnHx) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                        }
                    }
                }
            }
            int i64 = i51;
            if (z12 || i47 == 1073741824) {
                iMax6 = i64;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i65 = 0; i65 < i48; i65++) {
                    View childAt8 = getChildAt(i65);
                    if (childAt8.getVisibility() != 8) {
                        QnHx qnHx8 = (QnHx) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) qnHx8).width == -1) {
                            int i66 = ((LinearLayout.LayoutParams) qnHx8).height;
                            ((LinearLayout.LayoutParams) qnHx8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) qnHx8).height = i66;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.B = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.E == null || this.F == null) {
            this.E = new int[4];
            this.F = new int[4];
        }
        int[] iArr = this.E;
        int[] iArr2 = this.F;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.w;
        boolean z16 = this.D;
        boolean z17 = mode3 == 1073741824;
        int i67 = 0;
        float f8 = 0.0f;
        int iMax10 = 0;
        int i68 = 0;
        int iMax11 = 0;
        int iMax12 = 0;
        boolean z18 = true;
        boolean z19 = false;
        boolean z20 = false;
        int i69 = 0;
        while (i68 < virtualChildCount2) {
            View childAt9 = getChildAt(i68);
            if (childAt9 == null) {
                this.B += 0;
                i17 = i67;
                i18 = iMax10;
            } else {
                i17 = i67;
                i18 = iMax10;
                if (childAt9.getVisibility() == 8) {
                    i68 += 0;
                } else {
                    if (h(i68)) {
                        this.B += this.H;
                    }
                    QnHx qnHx9 = (QnHx) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) qnHx9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) qnHx9).width == 0 && f9 > 0.0f) {
                        if (z17) {
                            this.B = ((LinearLayout.LayoutParams) qnHx9).leftMargin + ((LinearLayout.LayoutParams) qnHx9).rightMargin + this.B;
                        } else {
                            int i70 = this.B;
                            this.B = Math.max(i70, ((LinearLayout.LayoutParams) qnHx9).leftMargin + i70 + ((LinearLayout.LayoutParams) qnHx9).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            qnHx3 = qnHx9;
                            i21 = i17;
                            i22 = i18;
                            i24 = i68;
                            z = z16;
                            z2 = z15;
                        } else {
                            qnHx3 = qnHx9;
                            i21 = i17;
                            i22 = i18;
                            i24 = i68;
                            i25 = 1073741824;
                            z = z16;
                            z2 = z15;
                            z3 = true;
                        }
                        if (mode4 == i25 && ((LinearLayout.LayoutParams) qnHx3).height == -1) {
                            z4 = true;
                            z20 = true;
                        } else {
                            z4 = false;
                        }
                        i26 = ((LinearLayout.LayoutParams) qnHx3).topMargin + ((LinearLayout.LayoutParams) qnHx3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i26;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i21, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i71 = ((LinearLayout.LayoutParams) qnHx3).gravity;
                            if (i71 < 0) {
                                i71 = this.A;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr[i72] = Math.max(iArr[i72], baseline2);
                            iArr2[i72] = Math.max(iArr2[i72], measuredHeight - baseline2);
                        }
                        int iMax13 = Math.max(i69, measuredHeight);
                        if (z18 || ((LinearLayout.LayoutParams) qnHx3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) qnHx3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i26;
                            }
                            iMax10 = Math.max(i22, measuredHeight);
                        } else {
                            int i73 = i22;
                            if (z4) {
                                measuredHeight = i26;
                            }
                            iMax12 = Math.max(iMax12, measuredHeight);
                            iMax10 = i73;
                        }
                        i69 = iMax13;
                        z18 = z5;
                        z19 = z3;
                        i67 = iCombineMeasuredStates4;
                        i68 = i24 + 0;
                        f8 = f10;
                    } else {
                        int i74 = i68;
                        if (((LinearLayout.LayoutParams) qnHx9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) qnHx9).width = -2;
                                i19 = 0;
                            }
                            if (f10 == f2) {
                                i20 = this.B;
                            } else {
                                i20 = 0;
                            }
                            i21 = i17;
                            i22 = i18;
                            i23 = i19;
                            i24 = i74;
                            z = z16;
                            z2 = z15;
                            measureChildWithMargins(childAt9, i, i20, i2, 0);
                            if (i23 != Integer.MIN_VALUE) {
                                qnHx3 = qnHx9;
                                ((LinearLayout.LayoutParams) qnHx3).width = i23;
                            } else {
                                qnHx3 = qnHx9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z17) {
                                this.B = ((LinearLayout.LayoutParams) qnHx3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) qnHx3).rightMargin + 0 + this.B;
                            } else {
                                int i75 = this.B;
                                this.B = Math.max(i75, i75 + measuredWidth + ((LinearLayout.LayoutParams) qnHx3).leftMargin + ((LinearLayout.LayoutParams) qnHx3).rightMargin + 0);
                            }
                            if (z) {
                                iMax11 = Math.max(measuredWidth, iMax11);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i19 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i20 = this.B;
                        } else {
                            i20 = 0;
                        }
                        i21 = i17;
                        i22 = i18;
                        i23 = i19;
                        i24 = i74;
                        z = z16;
                        z2 = z15;
                        measureChildWithMargins(childAt9, i, i20, i2, 0);
                        if (i23 != Integer.MIN_VALUE) {
                            qnHx3 = qnHx9;
                            ((LinearLayout.LayoutParams) qnHx3).width = i23;
                        } else {
                            qnHx3 = qnHx9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z17) {
                            this.B = ((LinearLayout.LayoutParams) qnHx3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) qnHx3).rightMargin + 0 + this.B;
                        } else {
                            int i76 = this.B;
                            this.B = Math.max(i76, i76 + measuredWidth + ((LinearLayout.LayoutParams) qnHx3).leftMargin + ((LinearLayout.LayoutParams) qnHx3).rightMargin + 0);
                        }
                        if (z) {
                            iMax11 = Math.max(measuredWidth, iMax11);
                        }
                    }
                    z3 = z19;
                    i25 = 1073741824;
                    if (mode4 == i25) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i26 = ((LinearLayout.LayoutParams) qnHx3).topMargin + ((LinearLayout.LayoutParams) qnHx3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i26;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i21, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax14 = Math.max(i69, measuredHeight);
                    if (z18) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) qnHx3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i26;
                        }
                        iMax10 = Math.max(i22, measuredHeight);
                    } else {
                        int i77 = i22;
                        if (z4) {
                            measuredHeight = i26;
                        }
                        iMax12 = Math.max(iMax12, measuredHeight);
                        iMax10 = i77;
                    }
                    i69 = iMax14;
                    z18 = z5;
                    z19 = z3;
                    i67 = iCombineMeasuredStates5;
                    i68 = i24 + 0;
                    f8 = f10;
                }
                i68++;
                z16 = z;
                z15 = z2;
            }
            z2 = z15;
            i67 = i17;
            iMax10 = i18;
            z = z16;
            i68++;
            z16 = z;
            z15 = z2;
        }
        int i78 = iMax10;
        boolean z21 = z16;
        boolean z22 = z15;
        int i79 = i69;
        if (this.B > 0 && h(virtualChildCount2)) {
            this.B += this.H;
        }
        int i80 = iArr[1];
        int i81 = i67;
        if (i80 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                iMax = i79;
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                i15 = 0;
                this.B = 0;
                i16 = 0;
                while (i16 < virtualChildCount2) {
                    childAt3 = getChildAt(i16);
                    if (childAt3 == null) {
                        this.B += i15;
                    } else if (childAt3.getVisibility() == 8) {
                        i16 += 0;
                    } else {
                        qnHx2 = (QnHx) childAt3.getLayoutParams();
                        if (z17) {
                            this.B = ((LinearLayout.LayoutParams) qnHx2).leftMargin + iMax11 + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0 + this.B;
                        } else {
                            int i82 = this.B;
                            this.B = Math.max(i82, i82 + iMax11 + ((LinearLayout.LayoutParams) qnHx2).leftMargin + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0);
                        }
                    }
                    i16++;
                    i15 = 0;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.B;
            this.B = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.B;
            if (!z19 || (i3 != 0 && f8 > 0.0f)) {
                f = this.C;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.B = 0;
                i4 = i3;
                int iMax15 = -1;
                i5 = 0;
                float f11 = f8;
                iCombineMeasuredStates = i81;
                while (i5 < virtualChildCount2) {
                    childAt = getChildAt(i5);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i10 = i4;
                        i11 = mode4;
                    } else {
                        QnHx qnHx10 = (QnHx) childAt.getLayoutParams();
                        float f12 = ((LinearLayout.LayoutParams) qnHx10).weight;
                        if (f12 > 0.0f) {
                            int i83 = (int) ((i4 * f12) / f11);
                            float f13 = f11 - f12;
                            int i84 = i4 - i83;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) qnHx10).topMargin + ((LinearLayout.LayoutParams) qnHx10).bottomMargin, ((LinearLayout.LayoutParams) qnHx10).height);
                            if (((LinearLayout.LayoutParams) qnHx10).width == 0) {
                                i14 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i83 <= 0) {
                                        i83 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i83, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f11 = f13;
                                i12 = i84;
                            } else {
                                i14 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i83;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f11 = f13;
                            i12 = i84;
                        } else {
                            i12 = i4;
                        }
                        if (z17) {
                            this.B = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) qnHx10).leftMargin + ((LinearLayout.LayoutParams) qnHx10).rightMargin + 0 + this.B;
                        } else {
                            int i85 = this.B;
                            this.B = Math.max(i85, childAt.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) qnHx10).leftMargin + ((LinearLayout.LayoutParams) qnHx10).rightMargin + 0);
                        }
                        i11 = mode4;
                        boolean z23 = i11 != 1073741824 && ((LinearLayout.LayoutParams) qnHx10).height == -1;
                        int i86 = i12;
                        int i87 = ((LinearLayout.LayoutParams) qnHx10).topMargin + ((LinearLayout.LayoutParams) qnHx10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i87;
                        iMax15 = Math.max(iMax15, measuredHeight4);
                        if (!z23) {
                            i87 = measuredHeight4;
                        }
                        int iMax16 = Math.max(iMax12, i87);
                        if (z18) {
                            i13 = -1;
                            boolean z24 = ((LinearLayout.LayoutParams) qnHx10).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i13) {
                                int i88 = ((LinearLayout.LayoutParams) qnHx10).gravity;
                                if (i88 < 0) {
                                    i88 = this.A;
                                }
                                int i89 = (((i88 & 112) >> 4) & (-2)) >> 1;
                                iArr[i89] = Math.max(iArr[i89], baseline);
                                iArr2[i89] = Math.max(iArr2[i89], measuredHeight4 - baseline);
                            }
                            iMax12 = iMax16;
                            z18 = z24;
                            i10 = i86;
                            iCombineMeasuredStates = iCombineMeasuredStates;
                            f11 = f11;
                        } else {
                            i13 = -1;
                        }
                        if (!z22) {
                        }
                        iMax12 = iMax16;
                        z18 = z24;
                        i10 = i86;
                        iCombineMeasuredStates = iCombineMeasuredStates;
                        f11 = f11;
                    }
                    i5++;
                    i4 = i10;
                    mode4 = i11;
                }
                i6 = i2;
                i7 = mode4;
                this.B = getPaddingRight() + getPaddingLeft() + this.B;
                i8 = iArr[1];
                if (i8 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c2 = 3;
                    if (iArr[3] == -1) {
                        iMax = iMax15;
                    }
                    if (z18 || i7 == 1073741824) {
                        iMax12 = iMax;
                    }
                    setMeasuredDimension(iResolveSizeAndState2 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax12, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                    if (z20) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        while (i9 < virtualChildCount2) {
                            childAt2 = getChildAt(i9);
                            if (childAt2.getVisibility() != 8) {
                                qnHx = (QnHx) childAt2.getLayoutParams();
                                if (((LinearLayout.LayoutParams) qnHx).height == -1) {
                                    int i90 = ((LinearLayout.LayoutParams) qnHx).width;
                                    ((LinearLayout.LayoutParams) qnHx).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((LinearLayout.LayoutParams) qnHx).width = i90;
                                }
                            }
                            i9++;
                        }
                    }
                }
                c2 = 3;
                i9 = 0;
                iMax = Math.max(iMax15, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i8, iArr[2]))));
                if (z18) {
                    iMax12 = iMax;
                } else {
                    iMax12 = iMax;
                }
                setMeasuredDimension(iResolveSizeAndState2 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax12, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                if (z20) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    while (i9 < virtualChildCount2) {
                        childAt2 = getChildAt(i9);
                        if (childAt2.getVisibility() != 8) {
                            qnHx = (QnHx) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) qnHx).height == -1) {
                                int i91 = ((LinearLayout.LayoutParams) qnHx).width;
                                ((LinearLayout.LayoutParams) qnHx).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((LinearLayout.LayoutParams) qnHx).width = i91;
                            }
                        }
                        i9++;
                    }
                }
            }
            int iMax17 = Math.max(iMax12, i78);
            if (z21 && mode3 != 1073741824) {
                for (int i92 = 0; i92 < virtualChildCount2; i92++) {
                    View childAt10 = getChildAt(i92);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((QnHx) childAt10.getLayoutParams())).weight > 0.0f) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax11, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = i2;
            iMax12 = iMax17;
            iCombineMeasuredStates = i81;
            i7 = mode4;
            i9 = 0;
            if (z18) {
                iMax12 = iMax;
            } else {
                iMax12 = iMax;
            }
            setMeasuredDimension(iResolveSizeAndState2 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax12, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                while (i9 < virtualChildCount2) {
                    childAt2 = getChildAt(i9);
                    if (childAt2.getVisibility() != 8) {
                        qnHx = (QnHx) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) qnHx).height == -1) {
                            int i93 = ((LinearLayout.LayoutParams) qnHx).width;
                            ((LinearLayout.LayoutParams) qnHx).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) qnHx).width = i93;
                        }
                    }
                    i9++;
                }
            }
        }
        c = 3;
        iMax = Math.max(i79, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i80, iArr[2]))));
        if (z21) {
            i15 = 0;
            this.B = 0;
            i16 = 0;
            while (i16 < virtualChildCount2) {
                childAt3 = getChildAt(i16);
                if (childAt3 == null) {
                    this.B += i15;
                } else if (childAt3.getVisibility() == 8) {
                    i16 += 0;
                } else {
                    qnHx2 = (QnHx) childAt3.getLayoutParams();
                    if (z17) {
                        this.B = ((LinearLayout.LayoutParams) qnHx2).leftMargin + iMax11 + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0 + this.B;
                    } else {
                        int i810 = this.B;
                        this.B = Math.max(i810, i810 + iMax11 + ((LinearLayout.LayoutParams) qnHx2).leftMargin + ((LinearLayout.LayoutParams) qnHx2).rightMargin + 0);
                    }
                }
                i16++;
                i15 = 0;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.B;
        this.B = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.B;
        if (z19) {
            f = this.C;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.B = 0;
            i4 = i3;
            int iMax18 = -1;
            i5 = 0;
            float f14 = f8;
            iCombineMeasuredStates = i81;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i10 = i4;
                    i11 = mode4;
                } else {
                    i10 = i4;
                    i11 = mode4;
                }
                i5++;
                i4 = i10;
                mode4 = i11;
            }
            i6 = i2;
            i7 = mode4;
            this.B = getPaddingRight() + getPaddingLeft() + this.B;
            i8 = iArr[1];
            if (i8 != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            i9 = 0;
            iMax = Math.max(iMax18, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i8, iArr[2]))));
        } else {
            f = this.C;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.B = 0;
            i4 = i3;
            int iMax19 = -1;
            i5 = 0;
            float f15 = f8;
            iCombineMeasuredStates = i81;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i10 = i4;
                    i11 = mode4;
                } else {
                    i10 = i4;
                    i11 = mode4;
                }
                i5++;
                i4 = i10;
                mode4 = i11;
            }
            i6 = i2;
            i7 = mode4;
            this.B = getPaddingRight() + getPaddingLeft() + this.B;
            i8 = iArr[1];
            if (i8 != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            i9 = 0;
            iMax = Math.max(iMax19, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i8, iArr[2]))));
        }
        if (z18) {
            iMax12 = iMax;
        } else {
            iMax12 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState3 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax12, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            while (i9 < virtualChildCount2) {
                childAt2 = getChildAt(i9);
                if (childAt2.getVisibility() != 8) {
                    qnHx = (QnHx) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) qnHx).height == -1) {
                        int i94 = ((LinearLayout.LayoutParams) qnHx).width;
                        ((LinearLayout.LayoutParams) qnHx).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) qnHx).width = i94;
                    }
                }
                i9++;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.w = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.G) {
            return;
        }
        this.G = drawable;
        if (drawable != null) {
            this.H = drawable.getIntrinsicWidth();
            this.I = drawable.getIntrinsicHeight();
        } else {
            this.H = 0;
            this.I = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.K = i;
    }

    public void setGravity(int i) {
        if (this.A != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A;
        if ((8388615 & i3) != i2) {
            this.A = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.D = z;
    }

    public void setOrientation(int i) {
        if (this.z != i) {
            this.z = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.J) {
            requestLayout();
        }
        this.J = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A;
        if ((i3 & 112) != i2) {
            this.A = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.C = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public CQf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CQf(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        this.w = true;
        this.x = -1;
        this.y = 0;
        this.A = 8388659;
        int[] iArr = xApe.H;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        bi5.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.C = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.x = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.D = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (typedArrayObtainStyledAttributes.hasValue(5) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = XTd3.l(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.J = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
