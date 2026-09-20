package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.xApe;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean w;
    public boolean x;
    public int y;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = -1;
        int[] iArr = xApe.F;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        bi5.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.w = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.w);
        }
    }

    private void setStacked(boolean z) {
        if (this.x != z) {
            if (!z || this.w) {
                this.x = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int i3;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = 0;
        if (this.w) {
            if (size > this.y && this.x) {
                setStacked(false);
            }
            this.y = size;
        }
        if (this.x || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.w && !this.x) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i4).getVisibility() == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            measuredHeight = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.x) {
                int childCount2 = getChildCount();
                for (int i5 = i4 + 1; i5 < childCount2; i5++) {
                    if (getChildAt(i5).getVisibility() == 0) {
                        i3 = i5;
                        break;
                    }
                }
                if (i3 >= 0) {
                    paddingBottom = getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            measuredHeight += paddingBottom;
        }
        Field field = bi5.a;
        if (bi5.LPt8Fixed.d(this) != measuredHeight) {
            setMinimumHeight(measuredHeight);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z && this.x) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
