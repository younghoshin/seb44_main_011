import { useDispatch } from 'react-redux';
import { ReactComponent as Logo } from '../assets/icons/logo.svg';
import Header from '../components/layouts/Header';
import { loginSuccess } from '../redux/reducers/loginSlice';
import * as PropTypes from "prop-types";

function GlobalStyle() {
    return null;
}

function LoginContainer(props) {
    return null;
}

LoginContainer.propTypes = {children: PropTypes.node};
const OAuht = () => {
    let url = location.href;
    let accessToken = (new URL(location.href)).searchParams.get('access_token').split(' ')[1];
    let refreshToken = (new URL(location.href)).searchParams.get('refresh_token');
    localStorage.setItem("accessToken", accessToken)
    localStorage.setItem("refreshToken", refreshToken)

    location.href='/'
    useDispatch(loginSuccess({ accessToken, refreshToken }));
    return (
        <>
            <GlobalStyle />
            <Header />
            <LoginContainer>
                <Logo />
            </LoginContainer>
        </>
    );
};
export default OAuht;