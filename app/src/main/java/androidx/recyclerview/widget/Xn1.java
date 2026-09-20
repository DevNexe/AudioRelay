package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Xn1 extends LPt9Fixed {
    public Xn1(RecyclerView.PRnFixed pRn) {
        super(pRn);
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int b(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        return view.getRight() + ((RecyclerView.y) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int c(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.y) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) yVar).leftMargin + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int d(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.y) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) yVar).topMargin + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int e(View view) {
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        this.a.getClass();
        return (view.getLeft() - ((RecyclerView.y) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int f() {
        return this.a.n;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int g() {
        RecyclerView.PRnFixed pRn = this.a;
        return pRn.n - pRn.B();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int h() {
        return this.a.B();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int i() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int j() {
        return this.a.m;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int k() {
        return this.a.A();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int l() {
        RecyclerView.PRnFixed pRn = this.a;
        return (pRn.n - pRn.A()) - pRn.B();
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int m(View view) {
        RecyclerView.PRnFixed pRn = this.a;
        Rect rect = this.c;
        pRn.G(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final int n(View view) {
        RecyclerView.PRnFixed pRn = this.a;
        Rect rect = this.c;
        pRn.G(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.LPt9Fixed
    public final void o(int i) {
        this.a.K(i);
    }
}
