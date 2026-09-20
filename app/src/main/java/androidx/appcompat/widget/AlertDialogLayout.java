package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends CQf {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int i(View view) {
        Field field = bi5.a;
        int iD = bi5.LPt8Fixed.d(view);
        if (iD > 0) {
            return iD;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                CQf.QnHx qnHx = (CQf.QnHx) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) qnHx).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                Field field = bi5.a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, bi5.NUlFixed.d(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = ((LinearLayout.LayoutParams) qnHx).leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) qnHx).rightMargin;
                    }
                    if (h(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) qnHx).topMargin;
                    childAt.layout(i7, i13, measuredWidth + i7, measuredHeight2 + i13);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) qnHx).bottomMargin + i13;
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) qnHx).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) qnHx).rightMargin;
                }
                i7 = i5 - i6;
                if (h(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i14 = paddingTop + ((LinearLayout.LayoutParams) qnHx).topMargin;
                childAt.layout(i7, i14, measuredWidth + i7, measuredHeight2 + i14);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) qnHx).bottomMargin + i14;
            }
        }
    }

    @Override // androidx.appcompat.widget.CQf, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int i3;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i, 0);
                    paddingBottom += view.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    iCombineMeasuredStates = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    i3 = i(view2);
                    measuredHeight = view2.getMeasuredHeight() - i3;
                    paddingBottom += i3;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                } else {
                    i3 = 0;
                    measuredHeight = 0;
                }
                if (view3 != null) {
                    view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    measuredHeight2 = view3.getMeasuredHeight();
                    paddingBottom += measuredHeight2;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                } else {
                    measuredHeight2 = 0;
                }
                int i5 = size - paddingBottom;
                if (view2 != null) {
                    int i6 = paddingBottom - i3;
                    int iMin = Math.min(i5, measuredHeight);
                    if (iMin > 0) {
                        i5 -= iMin;
                        i3 += iMin;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                    paddingBottom = i6 + view2.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                }
                if (view3 != null && i5 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
                    paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                }
                int iMax = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
                if (mode2 != 1073741824) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getVisibility() != 8) {
                            CQf.QnHx qnHx = (CQf.QnHx) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) qnHx).width == -1) {
                                int i9 = ((LinearLayout.LayoutParams) qnHx).height;
                                ((LinearLayout.LayoutParams) qnHx).height = childAt2.getMeasuredHeight();
                                measureChildWithMargins(childAt2, iMakeMeasureSpec, 0, i2, 0);
                                ((LinearLayout.LayoutParams) qnHx).height = i9;
                            }
                        }
                    }
                }
                z = true;
                break;
            }
            View childAt3 = getChildAt(i4);
            if (childAt3.getVisibility() != 8) {
                int id = childAt3.getId();
                if (id == R.id.topPanel) {
                    view = childAt3;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt3;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt3;
                }
            }
            i4++;
        }
        if (z) {
            return;
        }
        super.onMeasure(i, i2);
    }
}
