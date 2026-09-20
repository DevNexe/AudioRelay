package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.azefsw.audioconnect.R;
import defpackage.Th;
import defpackage.UT;
import defpackage.bi5;
import defpackage.m65;
import defpackage.qa2;
import defpackage.z01;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends z01 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public final QnHx E;
    public final LPt8Fixed F;
    public int G;
    public boolean H;

    public static class CQf extends ViewGroup.MarginLayoutParams {
        public CQf(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CQf(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public CQf() {
            super(-2, -2);
        }
    }

    public interface F1 {
    }

    public class LPt8Fixed implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener w;

        public LPt8Fixed() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    Field field = bi5.a;
                    view2.setId(bi5.NUlFixed.a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(chipGroup.E);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class QnHx implements CompoundButton.OnCheckedChangeListener {
        public QnHx() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.H) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.D) {
                chipGroup.d(compoundButton.getId(), true);
                chipGroup.G = compoundButton.getId();
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (chipGroup.G == id) {
                    chipGroup.setCheckedId(-1);
                }
            } else {
                int i = chipGroup.G;
                if (i != -1 && i != id && chipGroup.C) {
                    chipGroup.d(i, false);
                }
                chipGroup.setCheckedId(id);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(qa2.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        this.E = new QnHx();
        LPt8Fixed lPt8 = new LPt8Fixed();
        this.F = lPt8;
        this.G = -1;
        this.H = false;
        TypedArray typedArrayD = m65.d(getContext(), attributeSet, Th.A, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        int resourceId = typedArrayD.getResourceId(0, -1);
        if (resourceId != -1) {
            this.G = resourceId;
        }
        typedArrayD.recycle();
        super.setOnHierarchyChangeListener(lPt8);
        Field field = bi5.a;
        bi5.LPt8Fixed.s(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.G = i;
    }

    @Override // defpackage.z01
    public final boolean a() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.G;
                if (i2 != -1 && this.C) {
                    d(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void c(int i) {
        int i2 = this.G;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.C) {
            d(i2, false);
        }
        if (i != -1) {
            d(i, true);
        }
        setCheckedId(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof CQf);
    }

    public final void d(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.H = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.H = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CQf();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new CQf(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.C) {
            return this.G;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.C) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.A;
    }

    public int getChipSpacingVertical() {
        return this.B;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.G;
        if (i != -1) {
            d(i, true);
            setCheckedId(this.G);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) UT.CQf.a(getRowCount(), this.y ? getChipCount() : -1, this.C ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A != i) {
            this.A = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.B != i) {
            this.B = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(F1 f1) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.F.w = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.D = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // defpackage.z01
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.C != z) {
            this.C = z;
            this.H = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.H = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new CQf(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
