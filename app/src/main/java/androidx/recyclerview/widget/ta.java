package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends LPt9Fixed {
    public ta(RecyclerView.PRnFixed pRn) {
        super(pRn);
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int b(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        return view.getBottom() + ((RecyclerView.y) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int c(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.y) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) yVar).topMargin + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int d(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.y) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) yVar).leftMargin + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int e(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        return (view.getTop() - ((RecyclerView.y) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) yVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int f() {
        return this.a.o;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int g() {
        RecyclerView.PRnFixed pRn = this.a;
        return pRn.o - pRn.z();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int h() {
        return this.a.z();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int i() {
        return this.a.m;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int j() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int k() {
        return this.a.C();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int l() {
        RecyclerView.PRnFixed pRn = this.a;
        return (pRn.o - pRn.C()) - pRn.z();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int m(View view) {
        RecyclerView.PRnFixed pRn = this.a;
        Rect rect = this.c;
        pRn.G(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int n(View view) {
        RecyclerView.PRnFixed pRn = this.a;
        Rect rect = this.c;
        pRn.G(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final void o(int i) {
        this.a.L(i);
    }
}
