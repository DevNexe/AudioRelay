package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class wc0 extends BaseAdapter implements Filterable, xc0.QnHx {
    public xc0 C;
    public boolean x = true;
    public Cursor y = null;
    public boolean w = false;
    public int z = -1;
    public QnHx A = new QnHx();
    public CQf B = new CQf();

    public class CQf extends DataSetObserver {
        public CQf() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            wc0 wc0Var = wc0.this;
            wc0Var.w = true;
            wc0Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            wc0 wc0Var = wc0.this;
            wc0Var.w = false;
            wc0Var.notifyDataSetInvalidated();
        }
    }

    public class QnHx extends ContentObserver {
        public QnHx() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            wc0 wc0Var = wc0.this;
            if (!wc0Var.x || (cursor = wc0Var.y) == null || cursor.isClosed()) {
                return;
            }
            wc0Var.w = wc0Var.y.requery();
        }
    }

    public wc0(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.y;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                QnHx qnHx = this.A;
                if (qnHx != null) {
                    cursor2.unregisterContentObserver(qnHx);
                }
                CQf cQf = this.B;
                if (cQf != null) {
                    cursor2.unregisterDataSetObserver(cQf);
                }
            }
            this.y = cursor;
            if (cursor != null) {
                QnHx qnHx2 = this.A;
                if (qnHx2 != null) {
                    cursor.registerContentObserver(qnHx2);
                }
                CQf cQf2 = this.B;
                if (cQf2 != null) {
                    cursor.registerDataSetObserver(cQf2);
                }
                this.z = cursor.getColumnIndexOrThrow("_id");
                this.w = true;
                notifyDataSetChanged();
            } else {
                this.z = -1;
                this.w = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.w || (cursor = this.y) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.w) {
            return null;
        }
        this.y.moveToPosition(i);
        if (view == null) {
            op3 op3Var = (op3) this;
            view = op3Var.F.inflate(op3Var.E, viewGroup, false);
        }
        a(view, this.y);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.C == null) {
            this.C = new xc0(this);
        }
        return this.C;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.w || (cursor = this.y) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.y;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.w && (cursor = this.y) != null && cursor.moveToPosition(i)) {
            return this.y.getLong(this.z);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.w) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.y.moveToPosition(i)) {
            throw new IllegalStateException(GM.a("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.y);
        return view;
    }
}
