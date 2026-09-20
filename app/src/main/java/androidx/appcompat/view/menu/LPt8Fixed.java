package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed extends BaseAdapter {
    public final LayoutInflater A;
    public final int B;
    public final NUlFixed w;
    public int x = -1;
    public boolean y;
    public final boolean z;

    public LPt8Fixed(NUlFixed nUl, LayoutInflater layoutInflater, boolean z, int i) {
        this.z = z;
        this.A = layoutInflater;
        this.w = nUl;
        this.B = i;
        a();
    }

    public final void a() {
        NUlFixed nUl = this.w;
        YKK ykk = nUl.u;
        if (ykk != null) {
            nUl.i();
            ArrayList<YKK> arrayList = nUl.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == ykk) {
                    this.x = i;
                    return;
                }
            }
        }
        this.x = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final YKK getItem(int i) {
        ArrayList<YKK> arrayListK;
        boolean z = this.z;
        NUlFixed nUl = this.w;
        if (z) {
            nUl.i();
            arrayListK = nUl.j;
        } else {
            arrayListK = nUl.k();
        }
        int i2 = this.x;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListK.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<YKK> arrayListK;
        boolean z = this.z;
        NUlFixed nUl = this.w;
        if (z) {
            nUl.i();
            arrayListK = nUl.j;
        } else {
            arrayListK = nUl.k();
        }
        return this.x < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.A.inflate(this.B, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.w.l() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        byN.QnHx qnHx = (byN.QnHx) view;
        if (this.y) {
            listMenuItemView.setForceShowIcon(true);
        }
        qnHx.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
