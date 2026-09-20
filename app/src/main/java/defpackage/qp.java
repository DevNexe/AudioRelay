package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class qp implements CharacterIterator {
    public final CharSequence w;
    public final int y;
    public final int x = 0;
    public int z = 0;

    public qp(int i, CharSequence charSequence) {
        this.w = charSequence;
        this.y = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.z;
        if (i == this.y) {
            return (char) 65535;
        }
        return this.w.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.z = this.x;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.x;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.y;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.z;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.x;
        int i2 = this.y;
        if (i == i2) {
            this.z = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.z = i3;
        return this.w.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.z + 1;
        this.z = i;
        int i2 = this.y;
        if (i < i2) {
            return this.w.charAt(i);
        }
        this.z = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.z;
        if (i <= this.x) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.z = i2;
        return this.w.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        boolean z = false;
        if (i <= this.y && this.x <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("invalid position");
        }
        this.z = i;
        return current();
    }
}
