package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.azefsw.audioconnect.R;
import defpackage.Th;
import defpackage.UT;
import defpackage.bi5;
import defpackage.d_OZ;
import defpackage.ej4;
import defpackage.ia0;
import defpackage.m65;
import defpackage.qa2;
import defpackage.u92;
import defpackage.xj5;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int G = 0;
    public final QnHx A;
    public Integer[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public final ArrayList w;
    public final F1 x;
    public final YKK y;
    public final LinkedHashSet<NUlFixed> z;

    public class CQf extends d_OZ {
        public CQf() {
        }

        @Override // defpackage.d_OZ
        public final void d(View view, UT ut) {
            int i;
            this.a.onInitializeAccessibilityNodeInfo(view, ut.a);
            int i2 = MaterialButtonToggleGroup.G;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) != view) {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.d(i3)) {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            ut.k(UT.F1.a(0, 1, i, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public class F1 implements MaterialButton.QnHx {
        public F1() {
        }

        @Override // com.google.android.material.button.MaterialButton.QnHx
        public final void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.C) {
                return;
            }
            if (materialButtonToggleGroup.D) {
                materialButtonToggleGroup.F = z ? materialButton.getId() : -1;
            }
            if (materialButtonToggleGroup.e(materialButton.getId(), z)) {
                materialButtonToggleGroup.b(materialButton.getId(), materialButton.isChecked());
            }
            materialButtonToggleGroup.invalidate();
        }
    }

    public static class LPt8Fixed {
        public static final defpackage.F1 e = new defpackage.F1(0.0f);
        public final ia0 a;
        public final ia0 b;
        public final ia0 c;
        public final ia0 d;

        public LPt8Fixed(ia0 ia0Var, ia0 ia0Var2, ia0 ia0Var3, ia0 ia0Var4) {
            this.a = ia0Var;
            this.b = ia0Var3;
            this.c = ia0Var4;
            this.d = ia0Var2;
        }
    }

    public interface NUlFixed {
        void a();
    }

    public class QnHx implements Comparator<MaterialButton> {
        public QnHx() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class YKK implements MaterialButton.CQf {
        public YKK() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(qa2.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.w = new ArrayList();
        this.x = new F1();
        this.y = new YKK();
        this.z = new LinkedHashSet<>();
        this.A = new QnHx();
        this.C = false;
        TypedArray typedArrayD = m65.d(getContext(), attributeSet, Th.I, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(2, false));
        this.F = typedArrayD.getResourceId(0, -1);
        this.E = typedArrayD.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayD.recycle();
        Field field = bi5.a;
        bi5.LPt8Fixed.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.F = i;
        b(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = bi5.a;
            materialButton.setId(bi5.NUlFixed.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.A.add(this.x);
        materialButton.setOnPressedChangeListenerInternal(this.y);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonC = c(i);
            int iMin = Math.min(materialButtonC.getStrokeWidth(), c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonC.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                u92.g(layoutParams2, 0);
                u92.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                u92.h(layoutParams2, 0);
            }
            materialButtonC.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            u92.g(layoutParams3, 0);
            u92.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            e(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ej4 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.w.add(new LPt8Fixed(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        bi5.m(materialButton, new CQf());
    }

    public final void b(int i, boolean z) {
        Iterator<NUlFixed> it = this.z.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final MaterialButton c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(c(i), Integer.valueOf(i));
        }
        this.B = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final boolean e(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.E && checkedButtonIds.isEmpty()) {
            View viewFindViewById = findViewById(i);
            if (viewFindViewById instanceof MaterialButton) {
                this.C = true;
                ((MaterialButton) viewFindViewById).setChecked(true);
                this.C = false;
            }
            this.F = i;
            return false;
        }
        if (z && this.D) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                View viewFindViewById2 = findViewById(iIntValue);
                if (viewFindViewById2 instanceof MaterialButton) {
                    this.C = true;
                    ((MaterialButton) viewFindViewById2).setChecked(false);
                    this.C = false;
                }
                b(iIntValue, false);
            }
        }
        return true;
    }

    public final void f() {
        LPt8Fixed lPt8;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonC = c(i);
            if (materialButtonC.getVisibility() != 8) {
                ej4 shapeAppearanceModel = materialButtonC.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                ej4.QnHx qnHx = new ej4.QnHx(shapeAppearanceModel);
                LPt8Fixed lPt9 = (LPt8Fixed) this.w.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    defpackage.F1 f1 = LPt8Fixed.e;
                    if (i == firstVisibleChildIndex) {
                        lPt8 = z ? xj5.a(this) ? new LPt8Fixed(f1, f1, lPt9.b, lPt9.c) : new LPt8Fixed(lPt9.a, lPt9.d, f1, f1) : new LPt8Fixed(lPt9.a, f1, lPt9.b, f1);
                    } else if (i != lastVisibleChildIndex) {
                        lPt9 = null;
                    } else if (z) {
                        lPt8 = xj5.a(this) ? new LPt8Fixed(lPt9.a, lPt9.d, f1, f1) : new LPt8Fixed(f1, f1, lPt9.b, lPt9.c);
                    } else {
                        lPt8 = new LPt8Fixed(f1, lPt9.d, f1, lPt9.c);
                    }
                    lPt9 = lPt8;
                }
                if (lPt9 == null) {
                    qnHx.e = new defpackage.F1(0.0f);
                    qnHx.f = new defpackage.F1(0.0f);
                    qnHx.g = new defpackage.F1(0.0f);
                    qnHx.h = new defpackage.F1(0.0f);
                } else {
                    qnHx.e = lPt9.a;
                    qnHx.h = lPt9.d;
                    qnHx.f = lPt9.b;
                    qnHx.g = lPt9.c;
                }
                materialButtonC.setShapeAppearanceModel(new ej4(qnHx));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.D) {
            return this.F;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButtonC = c(i);
            if (materialButtonC.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonC.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.B;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.F;
        if (i == -1 || (materialButton = (MaterialButton) findViewById(i)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) UT.CQf.a(1, getVisibleButtonCount(), this.D ? 1 : 2).a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.A.remove(this.x);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.w.remove(iIndexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.E = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.D != z) {
            this.D = z;
            this.C = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButtonC = c(i);
                materialButtonC.setChecked(false);
                b(materialButtonC.getId(), false);
            }
            this.C = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
