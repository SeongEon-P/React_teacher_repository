const SearchBox=(props)=>{
    const handleChange=(e) =>{
        props.setSearchValue(e.target.value);
    }
    return(
        <div className="'col col-sm-4">
            <input className="form-control" value={props.searchValue} onChange={handleChange} placeholder="영화검색..."/>
        </div>
    )

}
export default SearchBox;