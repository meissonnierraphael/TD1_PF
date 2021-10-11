package TD1_PF;

public class Paire<A,B> implements IPaire<A,B>{
    
    private A _fst;
    private B _snd;

    public Paire(A parFst,B parSnd){
        this._fst=parFst;
        this._snd=parSnd;
    }

    public String toString(){
        return String.format("(%s, %s) :: Paire[%s,%s]", _fst, _snd, _fst.getClass().getSimpleName(), _snd.getClass().getSimpleName());
    }

    @Override
    public A fst() {
        return _fst;
    }

    @Override
    public B snd() {
        return _snd;
    }

    @Override
    public <C> IPaire<C, B> changeFst(C parVal) {
        return new Paire<C,B>(parVal,this._snd);
    }

    @Override
    public <C> IPaire<A, C> changeSnd(C parVal) {
        return new Paire<A,C>(this._fst, parVal);
    }}
